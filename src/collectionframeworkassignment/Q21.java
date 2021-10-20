package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;

/*21. Write a Java program to replace the second element
of a ArrayList with the specified element
* */
public class Q21 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        System.out.println(nameList);
        nameList.set(2,"Sumi");
        System.out.println(nameList);

    }
}
