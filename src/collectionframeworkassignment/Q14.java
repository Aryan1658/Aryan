package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
14. Write a Java program to  swap two elements in an array list.
* */
public class Q14 {
    public static void main(String[] args) {

        List<String> bikeList = new ArrayList<>() ;
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        bikeList.add("Bullet");
        bikeList.add("FZ");
        bikeList.add("Pulsar");
        bikeList.add("Yamaha 360");
        System.out.println(bikeList);
        System.out.println("------------------------------------------------------------");

        Collections.swap(bikeList,0,2);
        System.out.println(bikeList);

    }
}
