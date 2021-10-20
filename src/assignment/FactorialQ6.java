package assignment;

import java.util.Scanner;

public class FactorialQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1 ;
        int factorial = 1;
        System.out.println(" Enter the number you want to get factorial of:");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial = factorial*i;

        }
        System.out.println(" The factorial of "+ num + " is "+ factorial);


    }
}
