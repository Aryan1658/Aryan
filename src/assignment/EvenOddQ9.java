package assignment;

import java.util.Scanner;

public class EvenOddQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;

        System.out.println(" Enter the number:");
        num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            //System.out.println(" The entered number is Even.");
        } else {
            //System.out.println(" The entered number is Odd.");
        }
        System.out.println(num1 % 2 == 0);

    }
}
