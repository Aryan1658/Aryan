package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
1. Write a Java program to create a new array list, add some
colors (string) and print out the collection.
 */

class Q1 {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        // adding the data to the color list.
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Pink");
        colorList.add("Yellow");
        colorList.add("Grey");
        colorList.add("Blue");
        colorList.add("Violet");

        // displaying the list of the inserted data
        System.out.println(colorList);
        System.out.println("================================");


        // only displaying the colors ending in "n".
        for (String color : colorList) {
            if (color.endsWith("w"))
                System.out.println(color.toUpperCase());


        }


    }
}






