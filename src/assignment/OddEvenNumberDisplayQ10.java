package assignment;

import java.util.Scanner;

public class OddEvenNumberDisplayQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start;
        int end;
        String input;


        System.out.println(" Enter the starting number:");
        start = sc.nextInt();
        System.out.println(" Enter the ending number:");
        end = sc.nextInt();
        System.out.println("Please enter 1  to print even number or 2 to enter odd");
        sc.nextLine();
        input = sc.nextLine();

        if(input.equals("1")) {
            System.out.println(" The even numbers between " + start + " to " + end + " are :");
        } else {
            System.out.println(" The odd numbers between " + start + " to " + end + " are :");
        }

        System.out.println(" The " + (input.equals("1")?"even":"odd") + " numbers between " + start + " to " + end + " are :");



        if (end > start) {
            for (int i = start; i <= end; i++) {
                if (input.equals("1")) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }

                } else {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }

                }

            }
        } else if (start > end) {
            System.out.println(" Invalid!!Starting number should be greater");
        }

    }
}
