package collectionframeworkassignment;

import java.util.ArrayList;

/*
19. Write a Java program to trim the capacity of an array list the current list size.
* */
public class Q19 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        nameList.add("Raj");
        nameList.add("Sam");
        System.out.println(nameList);
        nameList.trimToSize();
        System.out.println(nameList.size());

    }

}
