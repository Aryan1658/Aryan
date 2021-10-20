package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
11. Write a Java program to reverse elements in an array list.
* */
public class Q11 {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();
        //Inserting the names in the ArrayList.
        nameList.add("Shasank");
        nameList.add("Bishal");
        nameList.add("Bibek");
        nameList.add("Raazan");
        nameList.add("Yogesh");
        nameList.add("Shreeya");
        nameList.add("Aryan");
        nameList.add("Sashika");
        System.out.println(nameList);
        //Reversing the elements of the ArrayList and displaying the result.
        Collections.reverse(nameList);
        System.out.println(nameList);

    }
}
