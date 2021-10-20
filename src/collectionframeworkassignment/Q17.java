package collectionframeworkassignment;

import java.util.ArrayList;

/*
17. Write a Java program to empty an array list.
* */
public class Q17 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        nameList.add("Raj");
        nameList.add("Sam");
        System.out.println(nameList);
        System.out.println("----------------------------------------");
        nameList.removeAll(nameList);
        System.out.println(nameList);
    }
}
