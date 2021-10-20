package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
12. Write a Java program to extract a portion of a array list.
* */
public class Q12 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bishal");
        nameList.add("Bibek");
        nameList.add("Raazan");
        nameList.add("Yogesh");
        nameList.add("Shreeya");
        nameList.add("Aryan");
        nameList.add("Sashika");
        System.out.println(nameList);

        List<String> nameRange = nameList.subList(3, 5);
        System.out.println(nameRange);


    }
}
