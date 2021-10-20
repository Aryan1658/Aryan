package operator;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float firstNumber,secondNumber;

        System.out.println("Enter the first Number");
        firstNumber = sc.nextFloat();

        System.out.println("Enter the second Number");
        secondNumber = sc.nextFloat();


        System.out.println("Addition " + (firstNumber + secondNumber));
        System.out.println("Subtraction " + (firstNumber - secondNumber));
        System.out.println("Division " + (firstNumber / secondNumber));
        System.out.println("Multiplication " + (firstNumber * secondNumber));
        System.out.println("Remainder " + (firstNumber % secondNumber));







    }
}
