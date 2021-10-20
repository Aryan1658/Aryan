package loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowerRange, higherRange, sum = 0;

        System.out.println(" Enter the lower range number:");
        lowerRange = sc.nextInt();
        System.out.println(" Enter the higher range number:");
        higherRange = sc.nextInt();

        int i = lowerRange;

        while(i <= higherRange) {
            System.out.print(i + " ");
            sum = sum + i;
            i++;

        }
        System.out.println(" \nThe sum of numbers between "+ lowerRange + " to " + higherRange + " is " + sum);

    }
}
