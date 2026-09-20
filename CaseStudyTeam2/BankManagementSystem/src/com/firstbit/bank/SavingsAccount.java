package com.firstbit.bank;

public class SavingsAccount extends BankAccount{
	private double minimumBalance;
	private double interestRate;
	private double withdrawalLimit;
	private int totalWithdrawals;

//default constructor
public SavingsAccount() {
	super(0, "Unknown", 0.0, "Savings", "Active");
	
	this.minimumBalance = 1000;
	this.interestRate = 4.0;
	this.withdrawalLimit = 20000;
	this.totalWithdrawals = 0;
}
//parameterized constructor
public SavingsAccount(int accNo, String holderName, double balance, String accountType, String status, double minimumBalance, double interestRate, double withdrawalLimit, int totalWithdrawals) {
	super(accNo, holderName, balance, accountType, status);
	
	this.minimumBalance = minimumBalance;
	this.interestRate = interestRate;
	this.withdrawalLimit = withdrawalLimit;
	this.totalWithdrawals = totalWithdrawals;
}
//methods start form here
public void withdraw(double amount) {
	if(amount<=0) {
		System.out.println("Invalid Withdrawal Ammount");
	}
	else if(amount>withdrawalLimit) {  
		System.out.println("Withdrawal limit exceeded");
	}
	else if(balance - amount < minimumBalance) {
		System.out.println("Minimum balance should be maintained");
	}
	else {                  
		balance = balance - amount;  
		totalWithdrawals++;
		System.out.println("Withdrawal Succesfull");
		System.out.println("Remaining Balance :" +balance);
	}
}
public double calculateInterest() {
	return balance * interestRate/100;	
}
public boolean checkMinimumBalance() {
	return balance >= minimumBalance;
}
public void updateInterestRate(double newRate) {
	if (newRate >=0) {
		interestRate = newRate;
		System.out.println("Interest Rate :" + interestRate);
	}
}
public void displayAccountSummary() {
	System.out.println("Account No :" + accNo);
	System.out.println("Holder Name :" + holderName);
	System.out.println("Balance :" +balance);
	System.out.println("Minimum Balance :" + minimumBalance);
	System.out.println("Interest Rate :" + interestRate);
	System.out.println("Withdrawal Limit :" + withdrawalLimit);
	System.out.println("Total Withdrawal :" + totalWithdrawals);
   }
}


