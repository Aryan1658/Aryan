package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
15. Write a Java program to join two array lists.
* */
public class Q15 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        // Listing the cars according to the price ranges.
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Dodge");
        carList.add("Toyota");
        carList.add("Nissan");
        carList.add("Honda");
        carList.add("Hyundai");
        System.out.println(carList);
        System.out.println("----------------------------------------------------------");

        List<String> bikeList = new ArrayList<>();
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        bikeList.add("Bullet");
        bikeList.add("FZ");
        bikeList.add("Pulsar");
        bikeList.add("Yamaha 360");
        System.out.println(bikeList);
        System.out.println("------------------------------------------------------------");

        List<String> addedList = new ArrayList<>();
        addedList.addAll(carList);
        addedList.addAll(bikeList);
        System.out.println(addedList);

    }
}
