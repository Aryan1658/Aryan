package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//5.Write a Java program to retrieve an element (at a specified index) from
//a given array list.
public class Q5 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Sandeep");
        System.out.println(nameList);
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        System.out.println(nameList.get(2));
     }
}
