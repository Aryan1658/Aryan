package collectionframeworkassignment;

import java.util.ArrayList;

/*
18. Write a Java program to test an array list is empty or not.
* */
public class Q18 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        nameList.add("Raj");
        nameList.add("Sam");
        System.out.println(nameList);
        System.out.println("----------------------------------------");
        System.out.println(nameList.isEmpty() ?  "Yes" :"No");

        ArrayList<String> nameList1 = new ArrayList<>();
        System.out.println("----------------------------------------");
        System.out.println(nameList1.isEmpty() ?  "Yes" :"No");

    }
}
