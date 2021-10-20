package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

// 4.Write a Java program to iterate through all elements in an array list.
public class Q4 {
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
