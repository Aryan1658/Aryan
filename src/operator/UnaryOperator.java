package operator;

import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 20;
        int b = 25;

        System.out.println(a + b );
        System.out.println(++a + b++);
        System.out.println(a++ + ++b);



    }
}
