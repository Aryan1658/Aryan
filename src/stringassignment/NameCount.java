package stringassignment;

import java.util.Scanner;

public class NameCount {
    public static void main (String [] args){
        String text;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names you want seperated by space.");
        text = sc.nextLine();

        String[] splittedName = text.split(" ");
        System.out.println("Total names " + splittedName.length);
        for( String name:splittedName){
            System.out.println(name);


        }


    }
}
