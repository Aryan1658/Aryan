package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
13. Write a Java program to compare two array lists.
* */
public class Q13 {
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

    List<String> comparison = new ArrayList<>();
        /*for(String e : bikeList)
            System.out.println((e.contains("e")) ? "Yes" : "No");


        }*/
    System.out.println(bikeList.containsAll(carList));


  }
}

