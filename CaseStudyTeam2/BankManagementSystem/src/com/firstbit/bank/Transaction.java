package com.firstbit.bank;
import java.util.Date;

	class Transaction {

	    int transactionId;
	    Date transactionDate;
	    double amount;
	    String transactionType;
	    double totalBalance;

	    public Transaction(int transactionId, Date transactionDate,
	                       double amount, String transactionType,
	                       double totalBalance) {

	        this.transactionId = transactionId;
	        this.transactionDate = transactionDate;
	        this.amount = amount;
	        this.transactionType = transactionType;
	        this.totalBalance = totalBalance;
	    }

	    public void displayTransaction() {

	        System.out.println("Transaction ID   : " + transactionId);
	        System.out.println("Transaction Date : " + transactionDate);
	        System.out.println("Amount           : " + amount);
	        System.out.println("Transaction Type : " + transactionType);
	        System.out.println("Total Balance    : " + totalBalance);
	    }
	}

