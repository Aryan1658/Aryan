package assignment;

import java.util.Scanner;

public class GetTotalQ2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num1;
         int num2;
         int sum = 0;
         int product;

        System.out.println(" Enter the first number:");
        num1 = sc.nextInt();
        System.out.println(" Enter the second number:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        product = num1 * num2;
        System.out.println(" The sum of " + num1 +" and "+ num2 + " is " + sum+" .");
        System.out.println(" The product of " + num1 +" and "+ num2 + " is " + product+" .");


    }
}
