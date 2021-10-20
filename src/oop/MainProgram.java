package oop;

import oop.encapack.BankAccount;
import oop.encapack.BankFunctions;
import oop.encapack.BankReaderClass;

import java.io.IOException;
import java.util.Scanner;


public class MainProgram {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double depositAmount;
        double withDrawAmount;
        String mobileNumber;
        String email;
        double finalAccountAmount;


        boolean isRunning = true;
        BankReaderClass brc = new BankReaderClass();
        BankFunctions bankFunctions = new BankFunctions();

        while (isRunning) {

            System.out.println("****************************");
            System.out.println("1 CREATE ACCOUNT");
            System.out.println("2 DISPLAY ACCOUNT DETAILS");
            System.out.println("3 DEPOSIT");
            System.out.println("4 WITHDRAW");
            System.out.println("5 CHECK BALANCE");
            System.out.println("6 EXIT");
            System.out.println("--ENTER YOUR CHOICE--");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BankAccount ba = brc.readNewAccountDetails();
                    bankFunctions.createBankAccount(ba.getAccountHolderName(),
                            ba.getEmail(),
                            ba.getMobileNumber(),
                            ba.getBalance());
                    break;
                case 2:
                    bankFunctions.displayAccountDetails();
                    break;
                case 3:
                    //This section is for deposit.
                    depositAmount = Double.parseDouble(brc.readDataFromUser("Enter amount to deposit."));
                    mobileNumber = brc.readDataFromUser("Enter your mobile number associated with your account. ");
                    email = brc.readDataFromUser("Enter your email address.");
                    bankFunctions.depositAmount(depositAmount, mobileNumber, email);
                    finalAccountAmount = bankFunctions.depositAmount(depositAmount, mobileNumber, email);
                    if (finalAccountAmount != 0) {
                        System.out.println("Amount deposited successfully\nYour new balance is " + finalAccountAmount);
                    }
                    break;
                case 4:
                    // This section is for withdraw.
                    withDrawAmount = Double.parseDouble(brc.readDataFromUser("Enter amount to withdraw."));
                    mobileNumber = brc.readDataFromUser("Enter your mobile number associated with your account. ");
                    email = brc.readDataFromUser("Enter your email address.");
                    finalAccountAmount = bankFunctions.withDrawAmount( withDrawAmount, mobileNumber, email);
                    if (finalAccountAmount != 0) {
                        System.out.println("Amount withdrawn successfully\nYour new balance is " + finalAccountAmount);
                    }
                        break;
                case 5:
                    // This section should show the single account details.
                    System.out.println("Under development");
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("You choose to exit.");
                    System.out.println("\u001B[33m" + "--------------------------------------------");
                    System.out.println("\u001B[33m" + "Thank you for using our banking services.");
                    System.out.println("\u001B[33m" + "--------------------------------------------");

                    break;
                default:
                    System.out.println("--------------------------------");
                    System.out.println("Invalid Input!!Please try again.");
                    System.out.println("--------------------------------");


            }
        }

    }

}
