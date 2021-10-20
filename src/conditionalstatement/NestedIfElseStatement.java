package conditionalstatement;

import java.util.Scanner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     /*  System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the third number:");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber) {

            if (firstNumber > thirdNumber) {
                System.out.println(thirdNumber + " is the largest.");

            } else {
                System.out.println(thirdNumber + " is the largest");

            }
        } else{
                if (secondNumber > thirdNumber){
                    System.out.println(secondNumber + " is the largest.");
                }
                else{
                    System.out.println(thirdNumber + " is the largest");
                }

            }*/

        System.out.println("Enter the first number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = sc.nextInt();

        System.out.println("Enter the third number:");
        int thirdNumber = sc.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " first number is the largest.");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " second number is the largest.");
        } else {
            System.out.println(thirdNumber + " third number is the largest.");
        }
    }
}

