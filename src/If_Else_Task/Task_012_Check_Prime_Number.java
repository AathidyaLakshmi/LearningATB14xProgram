package If_Else_Task;

import java.util.Scanner;

public class Task_012_Check_Prime_Number {
    public static void main(String[] args) {
        /*
        * number should be greater than 1
        * number should have two factors 1 and the same number itself
        * */
        int num=0,count=0;
        /*num -->to receive user input number from console
        * count-->to count number of factors for that number
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        if(sc.hasNextInt()){
           num=sc.nextInt();
        }
        else{
            System.out.println("Enter a valid integer number");
        }
        if(num>1)
        {
           for(int i=1;i<=num;i++)//To verify the number divisibility from 1 to that number
           {
              if(num%i==0)//To find its factor
              {
                  count++;
              }
           }
           if(count==2)
               System.out.println("Number "+num+" is prime");
           else
               System.out.println("Number "+num+" is not a prime");

        }
        else {
            System.out.println("Enter a integer greater than 1");
        }
    }
}
