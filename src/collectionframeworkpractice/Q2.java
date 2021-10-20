package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a new array list, add
// some colors (string)and print out the collection.
public class Q2 {
    public static void main(String[] args) {
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Yellow");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("Pink");
        colorList.add("Orange");
        System.out.println(colorList);
        for (String d : colorList){
            System.out.println(d);
        }
    }



}
