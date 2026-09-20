package com.firstbit.bank;

abstract class BankAccount {

    int accNo;
    String holderName;
    double balance;
    String accountType;
    String status;
    Transaction[] transactions;

   public BankAccount(int accNo, String holderName,
                      double balance, String accountType,
                      String status) {

       this.accNo = accNo;
       this.holderName = holderName;
       this.balance = balance;
       this.accountType = accountType;
       this.status = status;
   }

   public int getAccNo() {
       return accNo;
   }

   public void deposit(double amount) {
       balance += amount;
       System.out.println("Deposited : " + amount);
   }

   public abstract void withdraw(double amount);

   public abstract double calculateInterest();

   public void displayDetails() {

       System.out.println("Account No : " + accNo);
       System.out.println("Holder Name : " + holderName);
       System.out.println("Balance : " + balance);
       System.out.println("Account Type : " + accountType);
       System.out.println("Status : " + status);
   }

   public void addTransaction(Transaction transaction) {
       System.out.println("Transaction Added");
   }
}
