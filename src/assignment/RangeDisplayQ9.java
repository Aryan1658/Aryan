package assignment;

import java.util.Scanner;

public class RangeDisplayQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start;
        int end;

        System.out.println(" Enter the starting number:");
        start = sc.nextInt();
        System.out.println(" Enter the ending number:");
        end = sc.nextInt();


        if(start <= end ) {
            for (int i = start; i <= end; i++)
            System.out.print(i +"   ");
        }else if( start >=end){
            for (int i = start; i>=end; i--)

            System.out.print(i+ " ");
        }


        }


    }
