package collectionframeworkpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write a Java program to sort a given array list.
public class Q8 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Sandeep");
        Collections.sort(nameList,Collections.reverseOrder());
        System.out.println(nameList);
        for(int i= 0;i< nameList.size();i++){
            if(nameList.get(i).startsWith("Bi")){
                System.out.println(nameList.get(i));
            }

        }

    }
}
