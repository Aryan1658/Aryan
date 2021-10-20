package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to join two array lists.
public class Q11 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        // Listing the cars according to the price ranges.
        carList.add("BMW");
        carList.add("Mercedes");
        System.out.println(carList);
        System.out.println("----------------------------------------------------------");

        List<String> bikeList = new ArrayList<>(carList);
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        System.out.println(bikeList);
        System.out.println("------------------------------------------------------------");


    }
}
