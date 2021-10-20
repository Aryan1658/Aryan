package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lowerRange;
        int higherRange;
        int sumEven = 0;

        System.out.println(" Enter the first number:");
        lowerRange = sc.nextInt();
        System.out.println(" Enter the second number:");
        higherRange = sc.nextInt();

        if(higherRange > lowerRange){
            for (int i = lowerRange; i <= higherRange; i++){
                if (i %2 == 0){
                    sumEven = sumEven + i;
                    System.out.print(i + " " );
                }

            }
        }
        else{
            System.out.println(" Higher range should be higher than lower range.");
        }
        System.out.println("\n The sum of even numbers from " + lowerRange + " to " + higherRange + " is: " + sumEven);

    }
}
