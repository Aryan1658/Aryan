package collectionframeworkassignment;

import java.util.ArrayList;

/*
20. Write a Java program to increase the size of an array list.
* */
public class Q20 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        System.out.println(nameList);
        nameList.ensureCapacity(7);
        nameList.add("Raj");
        nameList.add("Sumi");
        nameList.add("Kamal");
        nameList.add("Samir");
        System.out.println(nameList);

    }
}
