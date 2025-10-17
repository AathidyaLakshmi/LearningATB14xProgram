package If_Else_Task;

import java.util.Scanner;

public class Task_5_Check_Eligiblity_To_Vote {
    public static void main(String[] args) {
        {
            int age;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your age");
            if(sc.hasNextInt())
            {
                age= sc.nextInt();
                String status=age>18?"You are eligible to vote":"You are not eligible to vote";
                System.out.println(status);
            }
            else
                System.out.println("Enter valid age in number");
        }
    }
}
