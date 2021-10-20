package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Write a Java program to sort a given array list.
* */
public class Q8 {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        numberList.add(4);
        numberList.add(6);
        numberList.add(5);
        numberList.add(9);
        numberList.add(7);
        numberList.add(10);
        System.out.println(numberList);
        Collections.sort(numberList);
        System.out.println(numberList);
        }

    }

