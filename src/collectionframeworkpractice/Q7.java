package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to search an element in an array list.
public class Q7 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Sandeep");
        System.out.println(nameList);
        System.out.println(nameList.contains("Bibek"));
        System.out.println(nameList.contains("Aryan"));
    }
}
