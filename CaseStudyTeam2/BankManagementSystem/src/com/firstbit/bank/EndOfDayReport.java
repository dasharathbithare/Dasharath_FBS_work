package com.firstbit.bank;

	
	import java.util.Date;
	class EndOfDayReport {

	    Date reportDate;
	    double totalDeposits;
	    double totalWithdrawals;
	    int totalTransactions;

	    public EndOfDayReport(Date reportDate,
	                          double totalDeposits,
	                          double totalWithdrawals,
	                          int totalTransactions) {

	        this.reportDate = reportDate;
	        this.totalDeposits = totalDeposits;
	        this.totalWithdrawals = totalWithdrawals;
	        this.totalTransactions = totalTransactions;
	    }

	    public void generateReport(Transaction[] transactions) {

	        totalDeposits = 0;
	        totalWithdrawals = 0;
	        totalTransactions = 0;

	        if (transactions != null) {

	            for (Transaction t : transactions) {

	                if (t != null) {

	                    totalTransactions++;

	                    if (t.transactionType.equalsIgnoreCase("Deposit")) {
	                        totalDeposits = totalDeposits + t.amount;
	                    }

	                    else if (t.transactionType.equalsIgnoreCase("Withdrawal")) {
	                        totalWithdrawals = totalWithdrawals + t.amount;
	                    }
	                }
	            }
	        }
	        System.out.println("------------------------------------");
	        System.out.println("\nEnd Of Day Report Generated");
	    }

	    public void displayReport() {

	        System.out.println("Report Date        : " + reportDate);
	        System.out.println("Total Deposits     : " + totalDeposits);
	        System.out.println("Total Withdrawals  : " + totalWithdrawals);
	        System.out.println("Total Transactions : " + totalTransactions);
	        System.out.println("-------------------------------------");
	    }
	}

	