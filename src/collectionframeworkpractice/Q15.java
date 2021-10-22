package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


//Write a Java program to append the specified element to the
// end of a linked list.
public class Q15 {
    public static void main(String[] args) {
       List<String> nameList = new LinkedList<>();
       nameList.add("Aryan");
       nameList.add("Shreeya");
       nameList.add("Shasank");
       nameList.add("Yogesh");
       nameList.add("Sam");
        System.out.println(nameList);
        nameList.set(nameList.size()-1,"Bibek" );
        System.out.println(nameList);

    }

}
