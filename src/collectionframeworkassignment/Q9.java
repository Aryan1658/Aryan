package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* 9. Write a Java program to copy one array list into another.
* */
public class Q9 {
    public static void main(String[] args) {
        List<String> classList = new ArrayList<>();
        classList.add("1");
        classList.add("2");
        classList.add("3");
        classList.add("4");
        classList.add("5");
        System.out.println(classList);
        System.out.println("---------------------------");

        List<String> sectionList = new ArrayList<>();
        sectionList.add("A");
        sectionList.add("B");
        sectionList.add("C");
        sectionList.add("D");
        sectionList.add("E");
        System.out.println(sectionList);
        System.out.println("---------------------------");

        Collections.copy(classList,sectionList);
        System.out.println("\u001B[34m"+ classList);
        System.out.println(sectionList);


    }
}
