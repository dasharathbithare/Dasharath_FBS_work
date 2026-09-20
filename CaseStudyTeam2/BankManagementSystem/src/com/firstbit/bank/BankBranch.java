package com.firstbit.bank;

class BankBranch {

    int branchId;
    String branchName;
    String branchAddress;
    String ifscCode;
    BankAccount[] accounts;

   public BankBranch(int branchId, String branchName,
                     String branchAddress, String ifscCode,
                     BankAccount[] accounts) {

       this.branchId = branchId;
       this.branchName = branchName;
       this.branchAddress = branchAddress;
       this.ifscCode = ifscCode;
       this.accounts = accounts;
   }

   public void openAccount(BankAccount account) {

	    if (account == null) {
	        System.out.println("Invalid Account");
	        return;
	    }

	    // Check duplicate account number
	    if (findAccount(account.getAccNo()) != null) {
	        System.out.println("Account already exists");
	        return;
	    }

	    // Find empty space
	    for (int i = 0; i < accounts.length; i++) {

	        if (accounts[i] == null) {
	            accounts[i] = account;
	            System.out.println("Account Opened Successfully");
	            return;
	        }
	    }

	    // If array is full, increase size
	    BankAccount[] newAccounts =
	            new BankAccount[accounts.length + 1];

	    for (int i = 0; i < accounts.length; i++) {
	        newAccounts[i] = accounts[i];
	    }

	    newAccounts[accounts.length] = account;
	    accounts = newAccounts;

	    System.out.println("Account Opened Successfully");
	
   }

   public void closeAccount(int accNo) {

	    for (int i = 0; i < accounts.length; i++) {

	        if (accounts[i] != null &&
	            accounts[i].getAccNo() == accNo) {

	            accounts[i] = null;

	            System.out.println("Account Closed Successfully");
	            return;
	        }
	    }
	    System.out.println("Account Not Found");
	}
   public BankAccount findAccount(int accNo) {

       if (accounts != null) {
           for (BankAccount acc : accounts) {
               if (acc != null && acc.getAccNo() == accNo) {
                   return acc;
               }
           }
       }
       return null;
   }

   public void generateEndOfDayReport() {
       System.out.println("End Of Day Report Generated");
   }

   public void displayAllAccounts() {

       if (accounts != null) {
           for (BankAccount acc : accounts) {
               if (acc != null) {
                   acc.displayDetails();
               }
           }
       }
   }
}       