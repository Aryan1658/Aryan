package array;

import java.util.Scanner;

public class LongestNameFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nameArray = new String[100];
        String choice = null;
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println("Enter the name:");
            nameArray[i] = sc.nextLine();
            System.out.println("Do you want to add more names?");
            System.out.println("Press Y or N.");
            choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }

        }
        System.out.println("Name insertion is complete.");

        String longestName = " ";
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] != null) {
                System.out.println(nameArray[i]);
                if (longestName.length() <= nameArray[i].length()) {
                    longestName = nameArray[i];
                }
            } else {
                break;
            }
        }
        System.out.println("*************************************");
        System.out.println("The longest name is of " + longestName  + " .");

    }

}
