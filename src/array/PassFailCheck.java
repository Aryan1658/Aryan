package array;

import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        long studentID;
        Double[] marks = new Double[5];


        System.out.println(" Please enter your name.");
        name = sc.nextLine();
        System.out.println("Enter your Student Id number.");
        studentID = sc.nextLong();

        for (int i = 0; i < marks.length; i++) {
            System.out.println(" Enter you marks in " + (i + 1) + " subject.");
            marks[i] = sc.nextDouble();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input!!Marks should be between 0 and 100.");
                i--;
            }
        }

        System.out.println("******************************");
        System.out.println("Your details:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Your marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " || ");
        }
        System.out.println("\n*****************************");

            double sum = 0.0;
            boolean isPassed = true;
            int failedSubject = 0;
            for (int i = 0; i< marks.length; i++){
                sum += marks[i];
                if (marks[i] < 35){
                    isPassed = false;
                    failedSubject++;
                }
            }
        System.out.println("Your total marks is " + sum + ".");

            double percentage = (sum / 500) * 100 ;
            if (percentage > 40 && isPassed){
                System.out.println("Congratulations!! " + name + " you have passed. Your percentage " + percentage + " %."+"You have passed in all 5 subjects.");
            }else
                System.out.println("Sorry!! " + name + " you have failed.Your percentage is " + percentage + " %." + " You have failed in " + failedSubject + " subjects.");




        }
    }

