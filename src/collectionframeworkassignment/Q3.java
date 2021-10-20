//package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
* 3. Write a Java program to insert an element into
the array list at the first position.
*/
public class Q3 {
    public static void main(String[] args) {

        List<String> elementList = new ArrayList<>();
        //inserting the elements into the arraylist.
        elementList.add("Aryan");
        elementList.add("Bikash");
        elementList.add("Ram");
        elementList.add("Ceeta");
        elementList.add("Tulasa");
        System.out.println(elementList);

        System.out.println("------------------------------------");

        //removing the element from the index 0 and 2,
        //replacing the element of the index 0 "Aryan" with "Shasank".
        //replacing the element of the index 2 "Ram" with "Bibek".
        elementList.remove( "Aryan");
        elementList.add(0, "Shasank");
        elementList.remove("Ram");
        elementList.add(2, "Bibek");
        System.out.println(elementList);
        System.out.println("------------------------------------");






    }

}
