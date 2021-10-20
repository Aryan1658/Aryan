package stringassignment;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1;
        String input2;

        System.out.println("Type the words from the keyboard:");
        input1 = sc.nextLine();
        System.out.println("Type another words from the keyboard:");
        input2 = sc.nextLine();

        System.out.println("The length of the " + input1 + " is " + input1.length() + ".");
        System.out.println("The length of the " + input2 + " is " + input2.length() + ".");
        if (input1.length() == input2.length()) {
            System.out.println("The length of the " + input1 + " and " + input2 + " is equal.");
        } else {
            System.out.println("The length of " + input1 + " and " + input2 + " is not equal.");
        }

    }
}
