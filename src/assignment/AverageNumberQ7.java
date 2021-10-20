package assignment;

import java.util.Scanner;

public class AverageNumberQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println(" Enter the first number:");
        num1 = sc.nextInt();
        System.out.println(" Enter the second number:");
        num2 = sc.nextInt();
        System.out.println(" Enter the third number:");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(" The first number " + num1 + " is the largest.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(" The second number " + num2 + " is the largest.");
        } else {
            System.out.println("The third number " + num3 + " is the largest.");
        }


    }
}
