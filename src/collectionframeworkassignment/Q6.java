package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
6. Write a Java program to remove the third element from an array list.
* */
public class Q6 {
    public static void main(String[] args) {

        List<String> companyList = new ArrayList<>();
        // Listing the companies.
        companyList.add("Apple");
        companyList.add("Samsung");
        companyList.add("Dell");
        companyList.add("Microsoft");
        companyList.add("HP");
        companyList.add("HTC");
        companyList.add("Huwaiee");
        companyList.add("Huwaiee");

        System.out.println(companyList);
        // Removing the element of the index 3 and displaying the result.
        companyList.remove(3);
        System.out.println(companyList);



    }

}
