package operator;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstNumber , secondNumber;

        System.out.println("Enter the first number: ");
        firstNumber = sc.nextDouble();
        System.out.println("Enter the second number: ");
        secondNumber = sc.nextDouble();

        firstNumber += secondNumber;
        System.out.println("The result of += is: " + firstNumber);

        firstNumber -= secondNumber;
        System.out.println("The result of -= is: " + firstNumber);

        firstNumber *= secondNumber;
        System.out.println("The result of *-= is: " + firstNumber);


        firstNumber /= secondNumber;
        System.out.println("The result of /= is: " + firstNumber);

        firstNumber %= secondNumber;
        System.out.println("The result of %= is: " + firstNumber);

    }
}
