package com.firstbit.bank;

import java.util.Date;
import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount(101, "Dasharath", 25000, "Savings Account", "Active", 1000, 4.0, 20000, 0);

        CurrentAccount current = new CurrentAccount(102, "Tanmay", 10000, "Current Account", "Active", 50000, 0, 100000, 500);

        SalaryAccount salary = new SalaryAccount(103, "Shreya", 50000, "Salary Account", "Active", 11092026, false, 25000, "Shreya");

        LoanAccount loan = new LoanAccount(104, "Aarushi", 0, "Loan Account", "Pending", 500000, 0, 8.5, 5, 500000);

        BankAccount[] accounts = { savings, current, salary, loan };

        BankBranch branch = new BankBranch(1, "FirstBit Main Branch", "Pune", "FBIN000101", accounts);

        int choice;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("       BANK MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Salary Account");
            System.out.println("4. Loan Account");
            System.out.println("5. Search Account");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Add Account");
            System.out.println("8. Close Account");
            System.out.println("9. Transaction");
            System.out.println("10. End Of Day Report");
            System.out.println("11. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                int savingsChoice;

                do {

                    System.out.println();
                    System.out.println("===== SAVINGS ACCOUNT =====");
                    System.out.println("Account Holder : Dasharath");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Calculate Interest");
                    System.out.println("5. Check Minimum Balance");
                    System.out.println("6. Update Interest Rate");
                    System.out.println("7. Display Account Summary");
                    System.out.println("8. Back");
                    System.out.print("Enter your choice : ");

                    savingsChoice = sc.nextInt();

                    switch (savingsChoice) {

                    case 1:
                        System.out.print("Enter Deposit Amount : ");
                        savings.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter Withdrawal Amount : ");
                        savings.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Current Balance : " + savings.balance);
                        break;

                    case 4:
                        System.out.println("Interest Amount : " + savings.calculateInterest());
                        break;

                    case 5:
                        System.out.println("Minimum Balance Maintained : " + savings.checkMinimumBalance());
                        break;

                    case 6:
                        System.out.print("Enter New Interest Rate : ");
                        savings.updateInterestRate(sc.nextDouble());
                        break;

                    case 7:
                        savings.displayAccountSummary();
                        break;

                    case 8:
                        break;

                    default:
                        System.out.println("Invalid Choice");
                    }

                } while (savingsChoice != 8);

                break;


            case 2:

                int currentChoice;

                do {

                    System.out.println();
                    System.out.println("===== CURRENT ACCOUNT =====");
                    System.out.println("Account Holder : Tanmay");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Use Overdraft");
                    System.out.println("5. Check Overdraft Limit");
                    System.out.println("6. Calculate Interest");
                    System.out.println("7. Charge Service Fee");
                    System.out.println("8. Display Account Summary");
                    System.out.println("9. Back");
                    System.out.print("Enter your choice : ");

                    currentChoice = sc.nextInt();

                    switch (currentChoice) {

                    case 1:
                        System.out.print("Enter Deposit Amount : ");
                        current.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter Withdrawal Amount : ");
                        current.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Current Balance : " + current.balance);
                        break;

                    case 4:
                        System.out.print("Enter Overdraft Amount : ");
                        current.useOverdraft(sc.nextDouble());
                        break;

                    case 5:
                        System.out.println("Overdraft Limit Valid : " + current.checkOverdraftLimit());
                        break;

                    case 6:
                        System.out.println("Interest Amount : " + current.calculateInterest());
                        break;

                    case 7:
                        current.chargesServiceFee();
                        break;

                    case 8:
                        current.displayAccountSummary();
                        break;

                    case 9:
                        break;

                    default:
                        System.out.println("Invalid Choice");
                    }

                } while (currentChoice != 9);

                break;


            case 3:

                int salaryChoice;

                do {

                    System.out.println();
                    System.out.println("===== SALARY ACCOUNT =====");
                    System.out.println("Account Holder : Shreya");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Calculate Annual Salary");
                    System.out.println("4. Credit Salary");
                    System.out.println("5. Calculate Interest");
                    System.out.println("6. Check Account Status");
                    System.out.println("7. Freeze Account");
                    System.out.println("8. Unfreeze Account");
                    System.out.println("9. Notify Holder");
                    System.out.println("10. Display Salary Account Summery");
                    System.out.println("11. Back");
                    System.out.print("Enter your choice : ");

                    salaryChoice = sc.nextInt();

                    switch (salaryChoice) {

                    case 1:
                        System.out.print("Enter Deposit Amount : ");
                        salary.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.print("Enter Withdrawal Amount : ");
                        salary.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        salary.calculateAnnualSalary();
                        break;

                    case 4:
                        salary.creditSalary();
                        break;

                    case 5:
                        System.out.println("Interest Amount : " + salary.calculateInterest());
                        break;

                    case 6:
                        System.out.println("Account Active : " + salary.checkAccountStatus());
                        break;

                    case 7:
                        salary.freezeAccount();
                        break;

                    case 8:
                        salary.unfreezeAccount();
                        break;

                    case 9:
                        salary.notifyHolder();
                        break;

                    case 10:
                        salary.displaySalary();
                        break;

                    case 11:
                        break;

                    default:
                        System.out.println("Invalid Choice");
                    }

                } while (salaryChoice != 11);

                break;


            case 4:

                int loanChoice;

                do {

                    System.out.println();
                    System.out.println("===== LOAN ACCOUNT =====");
                    System.out.println("Account Holder : Aarushi");
                    System.out.println("1. Request Loan");
                    System.out.println("2. Display Loan Details");
                    System.out.println("3. Calculate EMI");
                    System.out.println("4. Calculate Interest");
                    System.out.println("5. Check Outstanding Amount");
                    System.out.println("6. Repay Loan");
                    System.out.println("7. Close Loan Account");
                    System.out.println("8. Back");
                    System.out.print("Enter your choice : ");

                    loanChoice = sc.nextInt();

                    switch (loanChoice) {

                    case 1:
                        loan.requestLoan();
                        break;

                    case 2:
                        loan.displayLoanDetails();
                        break;

                    case 3:
                        System.out.println("EMI Amount : " + loan.calculateEMI());
                        break;

                    case 4:
                        System.out.println("Interest Amount : " + loan.calculateInterest());
                        break;

                    case 5:
                        System.out.println("Outstanding Amount : " + loan.getOutstandingAmount());
                        break;

                    case 6:
                        loan.repayLoan();
                        break;

                    case 7:
                        loan.closeLoanAccount();
                        break;

                    case 8:
                        break;

                    default:
                        System.out.println("Invalid Choice");
                    }

                } while (loanChoice != 8);

                break;


            case 5:

                System.out.print("Enter Account Number : ");
                int accNo = sc.nextInt();

                BankAccount foundAccount = branch.findAccount(accNo);

                if (foundAccount != null) {
                    foundAccount.displayDetails();
                } else {
                    System.out.println("Account Not Found");
                }

                break;


            case 6:

                System.out.println();
                System.out.println("===== ALL ACCOUNTS =====");

                branch.displayAllAccounts();

                break;


             // ==========================================
             // ADD ACCOUNT
             // ==========================================

             case 7:

                 System.out.println("\n===== ADD ACCOUNT =====");

                 System.out.println("1. Savings Account");
                 System.out.println("2. Current Account");
                 System.out.println("3. Salary Account");
                 System.out.println("4. Loan Account");

                 System.out.print("Enter Account Type: ");
                 int type = sc.nextInt();

                 System.out.print("Enter Account No: ");
                 int accNo1 = sc.nextInt();

                 System.out.print("Enter Holder Name: ");
                 sc.nextLine();
                 String holderName = sc.nextLine();

                 System.out.print("Enter Balance: ");
                 double balance = sc.nextDouble();

                 System.out.print("Enter Status: ");
                 sc.nextLine();
                 String status = sc.nextLine();

                 BankAccount account = null;

                 switch (type) {

                 // ------------------------------------------
                 // SAVINGS ACCOUNT
                 // ------------------------------------------

                 case 1:

                     System.out.print("Enter Minimum Balance: ");
                     double minimumBalance = sc.nextDouble();

                     System.out.print("Enter Interest Rate: ");
                     double interestRate = sc.nextDouble();

                     System.out.print("Enter Withdrawal Limit: ");
                     double withdrawalLimit = sc.nextDouble();

                     account = new SavingsAccount(
                             accNo1,
                             holderName,
                             balance,
                             "Savings",
                             status,
                             minimumBalance,
                             interestRate,
                             withdrawalLimit,
                             0
                     );

                     break;

                 // ------------------------------------------
                 // CURRENT ACCOUNT
                 // ------------------------------------------

                 case 2:

                     System.out.print("Enter Overdraft Limit: ");
                     double overdraftLimit = sc.nextDouble();

                     System.out.print("Enter Overdraft Used: ");
                     double overdraftUsed = sc.nextDouble();

                     System.out.print("Enter Transaction Limit: ");
                     double transactionLimit = sc.nextDouble();

                     System.out.print("Enter Monthly Service Charge: ");
                     double serviceCharge = sc.nextDouble();

                     account = new CurrentAccount(
                             accNo1,
                             holderName,
                             balance,
                             "Current",
                             status,
                             overdraftLimit,
                             overdraftUsed,
                             transactionLimit,
                             serviceCharge
                     );

                     break;

                 // ------------------------------------------
                 // SALARY ACCOUNT
                 // ------------------------------------------

                 case 3:

                     System.out.print("Enter Monthly Salary: ");
                     double monthlySalary = sc.nextDouble();

                     System.out.print("Enter Employee Name: ");
                     sc.nextLine();
                     String employeeName = sc.nextLine();

                     account = new SalaryAccount(
                             accNo1,
                             holderName,
                             balance,
                             "Salary",
                             status,
                             0,
                             false,
                             monthlySalary,
                             employeeName
                     );

                     break;

                 // ------------------------------------------
                 // LOAN ACCOUNT
                 // ------------------------------------------

                 case 4:

                     System.out.print("Enter Loan Amount: ");
                     double loanAmount = sc.nextDouble();

                     System.out.print("Enter Amount Repaid: ");
                     double amountRepaid = sc.nextDouble();

                     System.out.print("Enter Interest Rate: ");
                     double loanInterestRate = sc.nextDouble();

                     System.out.print("Enter Loan Tenure: ");
                     int loanTenure = sc.nextInt();

                     System.out.print("Enter Remaining Balance: ");
                     double remainingBalance = sc.nextDouble();

                     account = new LoanAccount(
                             accNo1,
                             holderName,
                             balance,
                             "Loan",
                             status,
                             loanAmount,
                             amountRepaid,
                             loanInterestRate,
                             loanTenure,
                             remainingBalance
                     );

                     break;

                 default:

                     System.out.println("Invalid Account Type!");
                 }

                 // Add account to branch
                 if (account != null) {

                     branch.openAccount(account);
                 }

                 break;


            case 8:

                System.out.print("Enter Account Number to Close : ");
                int closeAccNo = sc.nextInt();

                branch.closeAccount(closeAccNo);

                break;


            case 9:

                System.out.println();
                System.out.println("===== TRANSACTION =====");

                Transaction transaction = new Transaction(
                        1001,
                        new Date(),
                        5000,
                        "Deposit",
                        savings.balance
                );

                transaction.displayTransaction();

                break;


            case 10:

                System.out.println();
                System.out.println("===== END OF DAY REPORT =====");

                EndOfDayReport report = new EndOfDayReport(
                        new Date(),
                        5000,
                        3000,
                        2
                );

                report.generateReport(new Transaction[0]);
                report.displayReport();

                branch.generateEndOfDayReport();

                break;


            case 11:

                System.out.println("Thank You");

                break;


            default:

                System.out.println("Invalid Choice");
            }

        } while (choice != 11);

        sc.close();
    }
}