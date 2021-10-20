package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
16. Write a Java program to clone an array list to another array list.
* */
public class Q16 {
    public static void main(String[] args) {
        ArrayList<String> bikeList = new ArrayList<>();
        //Listing the types of motorcycles.
        bikeList.add("Harley Davidson");
        bikeList.add("Crossfire");
        bikeList.add("Bullet");
        bikeList.add("FZ");
        bikeList.add("Pulsar");
        bikeList.add("Yamaha 360");
        System.out.println(bikeList);
        System.out.println("------------------------------------------------------------");

        ArrayList<String>  list = (ArrayList<String>)bikeList.clone();
        System.out.println(list);
    }
}
