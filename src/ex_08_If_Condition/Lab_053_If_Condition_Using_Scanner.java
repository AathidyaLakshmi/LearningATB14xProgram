package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_053_If_Condition_Using_Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        //nextInt() method convert the input(we given in run time) to integer
        // If we give any input apart from integer data type compiler throw input mismatch exception

        if(age>18){
            System.out.println("You are eligible to vote");
        }
    }
}
