package assignment;

import java.util.Scanner;

public class VotingCheckQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age= 0;


        System.out.println(" Enter your name:");
        name = sc.nextLine();
        System.out.println(" Please enter your age:");
        age = sc.nextInt();

        if ( age >=18){
            System.out.println("Hello!! " + name +"." + "You are eligible to vote.");
        }else{
            System.out.println("Hello!! " + name +"." + "Sorry!! You are not eligible to vote.");
        }




    }
}
