package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayListProgram {
    public static void main(String[] args) {

        /**
         * T wrapper class(int, boolean X)
         * Integer, String, Object, Student
         * No primitive data types
         * List<T>  listName = new ImplementedClassName<>();
         *
         *
         */
        List<String> nameList = new ArrayList<>();
        //adding data to list
        nameList.add("bikash");
        nameList.add("ram");
        nameList.add("ceeta");
        nameList.add("aryan");
        nameList.add("tulasa");
        nameList.add("suraj");


        //display data in list
        System.out.println(nameList);
        for(String name : nameList){
            if(name.endsWith("a"));
            System.out.println(nameList);
            System.out.println(name.toUpperCase(Locale.ROOT));

        }
    }
}
