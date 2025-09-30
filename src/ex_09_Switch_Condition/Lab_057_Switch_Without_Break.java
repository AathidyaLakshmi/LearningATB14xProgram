package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab_057_Switch_Without_Break {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the day between 1 to 7:\t");
        if(sc.hasNextInt())
        {
            int day=sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("It is sunday");
                    // switch without break falls through next statement

                case 2:
                    System.out.println("It is monday");
                    case 3:
                    System.out.println("It is tuesday");

                case 4:
                    System.out.println("It is wednesday");

                case 5:
                    System.out.println("It is thursday");

                case 6:
                    System.out.println("It is friday");

                case 7:
                    System.out.println("It is saturday");

                default:
                    System.out.println("Enter day between 1 to 7");
            }

        }else{
            System.out.println("Kindly enter the valid integer input");
        }
    }

}
