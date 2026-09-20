package com.firstbit.bank;
import java.util.Scanner;
class LoanAccount extends BankAccount{
	double loanAmount;
	double amountRepaid;
	double interestRate;
	int loanTenure;
	double remainingBalance;
	
	LoanAccount(int accNo, String holderName,
            double balance, String accountType,
            String status,double loanAmount, double amountRepaid,
            double interestRate, int loanTenure, double remainingBalance) {
		super(accNo, holderName, balance, accountType, status);
		this.loanAmount = loanAmount;
		this.amountRepaid = amountRepaid;
		this.interestRate = interestRate;
		this.loanTenure = loanTenure;
		this.remainingBalance = remainingBalance;
	}
	
	void requestLoan() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("----- SELECT LOAN AMOUNT -----");
		System.out.println("1. ₹10,000 - ₹1,00,000");
		System.out.println("2. ₹1,00,000 - ₹10,00,000");
		System.out.println("3. ₹10,00,000 - ₹20,00,000");
		System.out.println("4. ₹20,00,000 - ₹30,00,000");
		System.out.println("5. ₹30,00,000 - ₹40,00,000");
		System.out.println("6. ₹40,00,000 - ₹50,00,000");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		System.out.print("Enter the loan amount you want: ");
		double requestedAmount = sc.nextDouble();

		switch (choice) {

		    case 1:
		        if (requestedAmount >= 10000 && requestedAmount <= 100000) {
		            System.out.printf("Selected Loan Amount: %.2f%n",
		                    requestedAmount);
		        } else {
		            System.out.println(
		                "Invalid amount. Please enter between ₹10,000 and ₹1,00,000."
		            );
		            return;
		        }
		        break;

		    case 2:
		        if (requestedAmount >= 100000 && requestedAmount <= 1000000) {
		            System.out.printf("Selected Loan Amount: %.2f%n",
		                    requestedAmount);
		        } else {
		            System.out.println(
		                "Invalid amount. Please enter between ₹1,00,000 and ₹10,00,000."
		            );
		            return;
		        }
		        break;

		    case 3:
		        if (requestedAmount >= 1000000 && requestedAmount <= 2000000) {
		            System.out.printf("Selected Loan Amount: %.2f%n", requestedAmount);
		        } else {
		            System.out.println("Invalid amount. Please enter between ₹10,00,000 and ₹20,00,000.");
		            return;
		        }
		        break;
		    case 4:
		        if (requestedAmount >= 2000000 && requestedAmount <= 3000000) {
		            System.out.printf("Selected Loan Amount: %.2f%n", requestedAmount);
		        } else {
		            System.out.println("Invalid amount. Please enter between ₹10,00,000 and ₹20,00,000." );
		            return;
		        }
		        break;
		    case 5:
		        if (requestedAmount >= 3000000 && requestedAmount <= 4000000) {
		            System.out.printf("Selected Loan Amount: %.2f%n", requestedAmount);
		        } else {
		            System.out.println("Invalid amount. Please enter between ₹30,00,000 and ₹40,00,000." );
		            return;
		        }
		        break;
		    case 6:
		        if (requestedAmount >= 4000000 && requestedAmount <= 5000000) {
		            System.out.printf("Selected Loan Amount: %.2f%n",requestedAmount);
		        } else {
		            System.out.println( "Invalid amount. Please enter between ₹40,00,000 and ₹50,00,000." );
		            return;
		        }
		        break;
		    default:
		        System.out.println("Invalid loan range.");
		        return;
		       
		}

		double interest = requestedAmount * interestRate / 100;
		System.out.println( "Requested Loan Amount : " +  requestedAmount ); 
		System.out.println( "Interest Rate : " + interestRate + "%" );
		System.out.println( "Interest Amount : " + interest );
		System.out.println( "Total Amount with Interest : " + (requestedAmount + interest) ); 
		System.out.print( "Do you approve this loan? (Y/N): " );
		char approval = sc.next().charAt(0); 
		if (approval == 'Y' || approval == 'y') {
			loanAmount = requestedAmount;
			remainingBalance = requestedAmount + interest; 
			status = "Approved";
			System.out.println( "Loan approved successfully." );
			System.out.println( "Approved Loan Amount : " + loanAmount );
			System.out.println( "Interest Amount : " + interest );
			System.out.println( "Outstanding Amount : " + remainingBalance );
		} 
		else {
			status = "Rejected"; 
			System.out.println( "Loan request rejected by customer." ); 
		} 
	}
	void repayLoan() { 
		double emi = calculateEMI(); 
		if (remainingBalance > 0) 
		{ 
			remainingBalance =remainingBalance - emi;
			if (remainingBalance < 0) 
			{ 
				remainingBalance = 0; 
			}
			amountRepaid += emi;
			System.out.printf("EMI paid:%.2f%n ", emi);
			System.out.printf("Remaining balance:%.2f%n ", remainingBalance); 
			} 
		else
		{ 
			System.out.println("Loan has already been fully repaid."); 
		}
	}
	public double calculateInterest() {
		return remainingBalance * interestRate / 100; 
	} 
	public void withdraw(double amount) {

	    if (amount <= 0) {
	        System.out.println("Invalid amount.");
	    }
	    else if (amount > balance) {
	        System.out.println("Insufficient balance.");
	    }
	    else {
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }
	}
	double getOutstandingAmount() {
		return remainingBalance; 
	} 
	double calculateEMI() {
		double monthlyRate = interestRate / (12 * 100); 
		int numberOfPayments = loanTenure * 12;
		if (monthlyRate == 0) 
		{ 
			return loanAmount / numberOfPayments; 
		}
		double emi = loanAmount * monthlyRate *
				Math.pow(1 + monthlyRate, numberOfPayments) /
				(Math.pow(1 + monthlyRate, numberOfPayments) - 1); 
		return emi;
	} 
	void displayLoanDetails() { 
		
		System.out.println("----- Loan Details -----"); 
		super.displayDetails();
		System.out.println("Loan Amount: " + this.loanAmount);
		System.out.println("Amount Repaid:  " + this.amountRepaid);
		System.out.println("Interest Rate: " + this.interestRate + "%");
		System.out.println("Loan Tenure: " + this.loanTenure + " years: ");
		System.out.println("Outstanding Amount: " + this.remainingBalance);
		System.out.printf("Monthly EMI: %.2f%n", this.calculateEMI()); 
		System.out.println("Interest: " + this.calculateInterest());
	}
	void closeLoanAccount() {

	    if (remainingBalance == 0) {

	        status = "Closed";

	        System.out.println("Loan Account " + accNo +
	            " has been closed successfully.");
	    } else {

	        System.out.println("Cannot close Loan Account: " + accNo);
	        System.out.printf("Outstanding amount is: %.2f%n" ,remainingBalance);
	    }
	}

}
