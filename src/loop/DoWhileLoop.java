package loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowerRange, higherRange, sum = 0;

        System.out.println(" Enter the lower range:");
        lowerRange = sc.nextInt();
        System.out.println(" Enter the lower range:");
        higherRange = sc.nextInt();

        int i = lowerRange;
        do {
            System.out.print(i + " ");
            sum = sum + i;
            i++;
        }while ( i <= higherRange);
        System.out.println(" \nThe sum of numbers between " + lowerRange + " to " + higherRange + " is " + sum);
    }

}
