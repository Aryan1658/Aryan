package bankaccount;


import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {


        Scanner sc1 = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();

        System.out.println("Enter your name:");
        bankAccount.customerName = sc1.nextLine();
        System.out.println("Enter your account number:");
        bankAccount.accountNumber = sc1.nextInt();
        int opt = 0;


        do {
            System.out.println("Press 1 for Checking account");
            System.out.println("Press 2 for Saving account.");
            opt = sc1.nextInt();
            switch (opt) {
                case 1:
                    System.out.println(bankAccount.accountType1 + " account is selected.");
                    break;
                case 2:
                    System.out.println(bankAccount.accountType2 + " account is selected.");
                    break;

                default:
                    opt = 5;
                    System.out.println("Invalid Input!! Select again.");
                    System.out.println("\n");
            }

        }
        while (opt == 5);


        int option = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("WELCOME!!! " + "\n" + "Name: " + bankAccount.customerName);
        System.out.println("Account number : " + bankAccount.accountNumber);
        if (opt == 1) {
            System.out.println("Account Type: " + bankAccount.accountType1);
        } else if (opt == 2) {
            System.out.println("Account Type: " + bankAccount.accountType2);
        } else {
            System.out.println("\n");
        }
        System.out.println("=======================================");
        System.out.println("Press 1 to check balance.");
        System.out.println("Press 2 to deposit.");
        System.out.println("Press 3 to withdraw.");
        System.out.println("Press 4 to view previous transaction.");
        System.out.println("Press 5 to exit");
        do {
            System.out.println("=====================================");
            System.out.println("Enter your option:");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your current balance is: $ " + bankAccount.balance);
                    break;
                case 2:
                    System.out.println("Enter an amount you want to deposit: $");
                    int amount = sc.nextInt();
                    if (amount >= 0) {
                        bankAccount.depositAmount(amount);

                    } else {
                        System.out.println("Invalid!!Please enter an valid amount.");
                    }
                    break;
                case 3:
                    System.out.println("Enter an amount you want to withdraw: $");
                    int amount2 = sc.nextInt();
                    bankAccount.withDraw(amount2);


                    break;
                case 4:
                    System.out.println("Your previous transaction: ");
                    bankAccount.getPreviousTransaction();
                    break;
                case 5:
                    System.out.println("Closing your transaction.");
                    break;
                default:
                    System.out.println("Invalid Input!!Please follow the instructions.");
            }

        } while (option != 5);
        System.out.println("\n");
        System.out.println("Thank you for using our banking services.");
    }
}

