package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
10. Write a Java program to shuffle elements in an array list.
* */
public class Q10 {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        //Listing the colors in the ArrayList.
        colorList.add("Green");
        colorList.add("Red");
        colorList.add("Orange");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Black");
        System.out.println(colorList);
        //Shuffling the colors by using shuffle function.
        Collections.shuffle(colorList);
        System.out.println(colorList);



    }
}
