package operator;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.println("Enter your first number: ");
        firstNumber = sc.nextInt();
        System.out.println("Enter your second number");
        secondNumber = sc.nextInt();

        System.out.println(firstNumber + " is smaller than " + secondNumber + " = " +(firstNumber<secondNumber));
        System.out.println(firstNumber + " is greater than " + secondNumber + " = " + (firstNumber>secondNumber));
        System.out.println(firstNumber + " is equals to " + secondNumber + " = " +(firstNumber==secondNumber));
        System.out.println(firstNumber + " is not equals to " + secondNumber + " = " + (firstNumber!=secondNumber));
        System.out.println(firstNumber + " is greater than or equals to " +secondNumber + " = " + (firstNumber>=secondNumber));
        System.out.println(firstNumber + " is less than or equals to "+ secondNumber + " = "+(firstNumber<=secondNumber));


    }
}
