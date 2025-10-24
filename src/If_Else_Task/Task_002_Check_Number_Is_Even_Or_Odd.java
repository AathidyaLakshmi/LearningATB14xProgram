package If_Else_Task;

import java.util.Scanner;

public class Task_002_Check_Number_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=0;
        if(sc.hasNextInt()){
            number= sc.nextInt();
            if(number>-1) {
                if (number % 2 == 0) {
                    System.out.println("The number is even");
                } else {
                    System.out.println("The number is odd");

                }
            }else {
                System.out.println("Enter positive integer");
            }
        }else {
            System.out.println("Enter valid integer");
        }
    }

}
