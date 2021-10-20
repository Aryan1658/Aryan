package conditionalstatement;

import java.util.Scanner;

public class IfElseIfStatement {
    /**
     * This is a simple program in which input is received from the user and checking in which age group s/he lies in.
     * 0 to 13 = kids
     * 13 to 21 = teenager
     * 22 to 35 = adult
     * 35 to 59 = young
     * 59 above = old
     * @param args
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age:");

        age = sc.nextInt();

        if(age > 0 && age <= 13){
            System.out.println("You are a kid.");
        }
        else if( age > 13 && age <= 21 ){
            System.out.println("You are teenager");
        }
        else if (age > 21 && age <=35){
            System.out.println("You are adult");
        }
        else if (age > 35 && age <=59){
            System.out.println("You are youth");
        }
        else if(age > 59 && age <=100){
            System.out.println(" You are old");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
