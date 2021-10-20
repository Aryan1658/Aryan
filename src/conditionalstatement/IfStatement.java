package conditionalstatement;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int firstNumber;

        System.out.println("Enter any number:");
        firstNumber = sc.nextInt();


        if (firstNumber % 2 == 0) {
            System.out.println("The entered number " + firstNumber + " is even.");

        } else {
            System.out.println("The entered number " + firstNumber + " is odd.");

        }


        int age;
        System.out.println("Enter your age:");

        age = sc.nextInt();
        if (age >= 16) {
            System.out.println("Congratulations!!Your are eligible to vote.");
        } else {
            System.out.println("Sorry!!You are not eligible to vote");
        }


    }
}
