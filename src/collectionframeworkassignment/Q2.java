package collectionframeworkassignment;

/*
* Write a Java program to iterate through all
 elements in an array list.
* */
import java.util.ArrayList;
import java.util.List;

public class Q2 {
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

        for(String color : colorList){
            System.out.println(color);
        }

    }
}
