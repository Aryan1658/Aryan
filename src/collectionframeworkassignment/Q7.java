package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 7. Write a Java program to search an element in an array list.
 * */
public class Q7 {
    public static void main(String[] args) {

        List<String> bikeList = new ArrayList<>();
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        bikeList.add("Bullet");
        bikeList.add("FZ");
        bikeList.add("Pulsar");
        bikeList.add("Yamaha 360");
        System.out.println(bikeList);
        //Searching the motorcycle from the ArrayList.
        //if (bikeList.contains("Harley Davidson")) {
        if (bikeList.contains("Honda")) {
            System.out.println("Your choice of bike is available.");
        } else {
            System.out.println("Sorry!! This motorcycle is not available in our store");
        }
    }
}
