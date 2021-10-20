package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to trim the capacity of an array
// list the current list size.
public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(10);
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Sandeep");
        System.out.println(nameList);
        nameList.trimToSize();
        System.out.println(nameList);
    }
}
