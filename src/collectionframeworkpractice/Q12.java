package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to empty an array list.
public class Q12 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        // Listing the cars according to the price ranges.
        carList.add("BMW");
        carList.add("Mercedes");
        System.out.println(carList);
        carList.clear();
        System.out.println(carList);
    }
}
