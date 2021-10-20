package collectionframeworkassignment;

import java.util.ArrayList;
import java.util.List;

/*
5. Write a Java program to update specific array element by given element.
* */
public class Q5 {
    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();

        studentList.add("Ram");
        studentList.add("Hari");
        studentList.add("Sita");
        studentList.add("Geeta");
        studentList.add("Rita");

        System.out.println(studentList);
        //Let's now replace the element of index 3 with Suneeta.
        studentList.set(3,"Suneeta");
        System.out.println(studentList);

    }
}
