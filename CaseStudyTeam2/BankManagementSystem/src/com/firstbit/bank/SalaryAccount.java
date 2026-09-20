package com.firstbit.bank;

	import java.time.LocalDate; 
	import java.time.format.DateTimeFormatter;
	import java.time.temporal.ChronoUnit;
	class SalaryAccount extends BankAccount{
		int lastTransactionDate;
		boolean isFrozen;
		double monthlySalary;
		String employeeName;
		
		SalaryAccount(int accNo, String holderName,
	            double balance, String accountType,
	            String status,int lastTransactionDate, 
	            boolean isFrozen, double monthlySalary,
	            String employeeName) {
			super(accNo, holderName, balance, accountType, status);
			this.lastTransactionDate = lastTransactionDate;
			this.isFrozen = isFrozen;
			this.monthlySalary = monthlySalary;
			this.employeeName = employeeName;
		}
		void freezeAccount() 
		{ 
			String dateString = String.format("%08d", lastTransactionDate); 
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy"); 
			LocalDate lastDate = LocalDate.parse(dateString, formatter); 
			LocalDate currentDate = LocalDate.now();
			long months = ChronoUnit.MONTHS.between(lastDate, currentDate);
			
			if (isFrozen) {
				System.out.println( "Account is already frozen." );
			}
			else if (months >= 2) {
				isFrozen = true;
				System.out.println( "Account has been frozen because there was no transaction for 2 months." ); 
			}
			else { 
				System.out.println( "Account cannot be frozen. Last transaction was less than 2 months ago." );
			}
		}
		void unfreezeAccount() {

		    if (!isFrozen) 
		        System.out.println("Account is already not frozen.");
		    else {
		        isFrozen = false;
		        System.out.println("Account has been unfrozen.");
		    }
		}
		public void deposit(double amount) { 
			if (isFrozen) { 
				System.out.println( "Cannot deposit. Account is frozen." ); 
			}
			else if (amount <= 0) {
				System.out.println( "Invalid deposit amount." ); 
			} 
			else {
				balance += amount; 
				updateLastTransactionDate();
				System.out.println( "Deposited : " + amount ); 
			}
		}
		public void withdraw(double amount) {
			if (isFrozen) { 
				System.out.println("Cannot withdraw. Account is frozen."); 
			}
			else if (amount <= 0) { 
				System.out.println("Invalid withdrawal amount.");
			}
			else if (amount > balance) { 
				System.out.println("Insufficient balance.");
			} 
			else { 
				balance -= amount;
				updateLastTransactionDate();
				System.out.println("Withdrawn : " + amount); 
			}
		}
		void updateLastTransactionDate() {
			LocalDate today = LocalDate.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
			lastTransactionDate = Integer.parseInt( today.format(formatter) );
		}
		boolean checkAccountStatus() {
			if (isFrozen) {
				System.out.println("Account is frozen."); 
				return false;
			} 
			else { 
				System.out.println("Account is not frozen."); 
				return true; 
			}
		}
		void notifyHolder() {
			if (employeeName != null && !employeeName.isEmpty())
			{ 
				System.out.println("Account holder found: " + employeeName); 
				System.out.println("Notification sent to " + employeeName); 
			} 
			else 
				System.out.println("Account holder not found."); 
		} 
		
		void creditSalary() { 
			if (!isFrozen) {
				balance += monthlySalary; 
				updateLastTransactionDate();
				System.out.println("Salary of " + monthlySalary + " credited to " + employeeName); 
			}else
				System.out.println("Cannot credit salary. Account is frozen.");
		} 
		public double calculateInterest() {
			return balance*4/100;
		}
		double calculateAnnualSalary() {
		    return monthlySalary * 12;

		}
		void displaySalary() {
			System.out.println("----Salary Account Details---");
			super.displayDetails();
			System.out.println("Last Transaction Date: "+this.lastTransactionDate);
			System.out.println("Is Frozen: "+this.isFrozen);
			System.out.println("Monthly Salary: "+this.monthlySalary);
			System.out.println("Employee Name: "+this.employeeName);
			System.out.println("Monthly Salary:₹ "+this.monthlySalary);
			System.out.println("Annual Salary:₹ "+this.calculateAnnualSalary());
		}
		
	}
	