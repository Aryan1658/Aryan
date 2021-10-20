package stringassignment;

import java.util.Locale;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input ;
        System.out.println("Type the words of your desire");
        input = sc.nextLine();
        System.out.println("You entered:" + "\n" + input);
        System.out.println("The length of the words you entered is: " + input.length());
        for(int i = 0; i<= input.length(); i ++){
            System.out.println(input.toUpperCase(Locale.ROOT).charAt(i));
        }
    }
}
