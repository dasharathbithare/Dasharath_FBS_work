package com.firstbit.bank;

public class CurrentAccount extends BankAccount {
	private double overdraftLimit;
	private double overdraftUsed;
	private double transactionLimit;
	private double monthlyServiceCharge;
//default constructor
public CurrentAccount() {
	super(0, "Unknown", 0.0, "Current", "active");
	
	this.overdraftLimit = 50000;
	this.overdraftUsed = 0;
	this.transactionLimit = 100000;
	this.monthlyServiceCharge = 500;
}
//Parameterized constructor
public CurrentAccount(int accNo, String holderName, double balance, String accountType, String status, double overdraftLimit, double overdraftUsed, double transactionLimit,
		double monthlyServiceCharge) {
	super(accNo, holderName, balance, accountType, status);
	
	this.overdraftLimit = overdraftLimit;
	this.overdraftUsed = overdraftUsed;
	this.transactionLimit = transactionLimit;
	this.monthlyServiceCharge = monthlyServiceCharge;
}
//methods starts from here
public void useOverdraft(double amount) {
	double requiredOverdraft = amount - balance;
	
    if (overdraftUsed + requiredOverdraft <= overdraftLimit) {
        balance = balance - amount;
        overdraftUsed = overdraftUsed + requiredOverdraft;
        System.out.println("Withdrawal successful using overdraft");
        System.out.println("Balance : " + balance);
        System.out.println("Overdraft used : " + overdraftUsed);
    }
    else {
        System.out.println("Overdraft limit exceeded");
    }
}
public void withdraw(double amount) {
	if (amount <= 0) {
        System.out.println("Invalid withdrawal amount");
    }
	else if (amount > transactionLimit) {
        System.out.println("Transaction Amount Exceeded");
    } 
    else if (amount <= balance) {
        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance : " + balance);
    } 
    else {
        useOverdraft(amount);
    }
}
@Override
public void deposit(double amount) {
    if (amount <= 0) {
        System.out.println("Invalid deposit amount");
        return;
    }
    // If overdraft is used
    if (balance < 0) {
        double overdraftDebt = -balance;
        if (amount <= overdraftDebt) {

            balance = balance + amount;
            overdraftUsed = overdraftUsed - amount;

            System.out.println("Amount used to clear overdraft");
            System.out.println("Remaining Overdraft : " + overdraftUsed);
            System.out.println("Balance : " + balance);
        } 
        else {
            double remainingAmount = amount - overdraftDebt;
            balance = 0;
            overdraftUsed = 0;
            balance = balance + remainingAmount;
            System.out.println("Overdraft cleared successfully");
            System.out.println("Remaining Deposit : " + remainingAmount);
            System.out.println("Balance : " + balance);
        }
    } 
    else {
        balance = balance + amount;
        System.out.println("Deposited : " + amount);
        System.out.println("Balance : " + balance);
    }
}
public double calculateInterest() {
	return balance * 4.0/100;
	
}
public boolean checkOverdraftLimit() {
	return overdraftUsed <= overdraftLimit; //check overdraft limit
}
public void chargesServiceFee() {
	balance = balance - monthlyServiceCharge;
	if (balance <0) {
		overdraftUsed = -balance;
	}
	System.out.println("Service Fee Charged :" + monthlyServiceCharge);
	System.out.println("Remaining Balance :" + balance);
	System.out.println("Overdraft Used :" +overdraftUsed);
	
}
public void displayAccountSummary() {
	System.out.println("Account No :" + accNo);
	System.out.println("Holder Name :" + holderName);
	System.out.println("Balance :" +balance);
	System.out.println("Account Type :" + accountType);
	System.out.println("Status :" +status);
	System.out.println("Overdraft Limit :" + overdraftLimit);
	System.out.println("Overdraft Used :" + overdraftUsed);
	System.out.println("Transaction Limit :" + transactionLimit);
	System.out.println("Monthly Service Charge :" + monthlyServiceCharge);
  }
}
