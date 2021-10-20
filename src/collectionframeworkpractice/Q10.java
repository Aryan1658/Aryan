package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to compare two array lists.
public class Q10 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        // Listing the cars according to the price ranges.
        carList.add("BMW");
        carList.add("Mercedes");
        System.out.println(carList);
        System.out.println("----------------------------------------------------------");

        List<String> bikeList = new ArrayList<>();
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        System.out.println(bikeList);
        System.out.println("------------------------------------------------------------");

        List<String> comparison = new ArrayList<>();
        /*for(String e : bikeList)
            System.out.println((e.contains("e")) ? "Yes" : "No");


        }*/
        System.out.println(bikeList.containsAll(carList));


    }
}
