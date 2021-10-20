package assignment;

import java.util.Scanner;

public class AreaOfCircleQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        double area;
        double circumference;

        System.out.println("Enter your desired radius of circle:");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;

        System.out.println(" The area of circle is " + area +" . ");

        System.out.println(" \nEnter the desired number to calculate the circumference of circle:");
        circumference = sc.nextDouble();
        circumference = 2 * Math.PI * radius;
        System.out.println(" The  circumference of circle is " + circumference +" . ");


    }
}
