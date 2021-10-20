package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
* 4. Write a Java program to retrieve an element (at a specified index)
 from a given array list.
*/
public class Q4 {
    public static void main(String[] args) {
        List<String> carList = new ArrayList<>();
        // Listing the cars according to the price ranges.
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Dodge");
        carList.add("Toyota");
        carList.add("Nissan");
        carList.add("Honda");



        System.out.println(carList);
        // Retrieving the names of the cars according to the index number.
        String car1 = carList.get(0);
        System.out.println("\u001B[34m"+ "First car: " +  car1 );

        String car2 = carList.get(1);
        System.out.println("Second car: " + car2);

        String car3 = carList.get(2);
        System.out.println("Third car: " + car3);

        String car4 = carList.get(3);
        System.out.println("Fourth car: " + car4);

        String car5 = carList.get(4);
        System.out.println("Fifth car: " + car5);

        String car6 = carList.get(5);
        System.out.println("Sixth car: " + car6);


    }

}
