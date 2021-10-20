package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to remove the third element from an array list.
public class Q6 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Sandeep");
        System.out.println(nameList);
        nameList.remove("Abiral");
        System.out.println(nameList);
    }
}
