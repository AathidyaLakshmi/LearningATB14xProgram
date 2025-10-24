package If_Else_Task;

import java.util.Scanner;

public class Task_001_Check_Number_Is_Positive_Or_Negative {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int number= sc.nextInt();
            if(number<0)
            {
                System.out.println("You number is Negative Integer");
            } else if (number==0) {
                System.out.println("Your number is Zero");

            }else{
                System.out.println("Your number is positive integer");
            }
        }
        else {
            System.out.println("Enter valid integer number");
            sc.next();
        }
        sc.close();
    }
}
