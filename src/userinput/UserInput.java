/**
 * @author Aryan Rijal
 */
package userinput;
import java.util.Scanner;

public class UserInput {
    /**
     * This is a sample application that takes the input from the user and gives th output to the user.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();



       System.out.println(" Enter your age ");
        int age = sc.nextInt();

        System.out.println("Enter your weight:");
        double weight = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter your email id:");
        String email = sc.nextLine();

        System.out.println(" Hello! " + name + "."+ " You are " + age + " years old."+" You are " + weight + " kilograms "+ " Sending email to " + email );



    }
}
