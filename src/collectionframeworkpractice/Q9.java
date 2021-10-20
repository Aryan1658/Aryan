package collectionframeworkpractice;
//Write a Java program to extract a portion of an array list.
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first index.");
        int firstindex = sc.nextInt();
        System.out.println("Enter the last index.");
        int endIndex = sc.nextInt();

        List<String> nameList = new ArrayList<>();
        nameList.add("Shasank");
        nameList.add("Bikash");
        nameList.add("Abiral");
        nameList.add("Bibek");
        nameList.add("Aryan");
        nameList.add("Sandeep");
        nameList.add("Razan");
        nameList.add("Bishal");
        System.out.println(nameList.subList(firstindex,endIndex));


    }
}
