package collectionframeworkassignment;

import java.util.ArrayList;

public class Q22 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Aryan");
        nameList.add("Bikash");
        nameList.add("Bibek");
        nameList.add("Sumi");
        System.out.println(nameList);
        System.out.println("----------------------------------------");
        for(String a : nameList)
        System.out.println(a);
        System.out.println("----------------------------------------");
         System.out.println(nameList.get(0));

//         int elements = nameList.size();
//         for(int i = 0; i< elements;i++)
//             System.out.println(nameList.get(i));


    }
}
