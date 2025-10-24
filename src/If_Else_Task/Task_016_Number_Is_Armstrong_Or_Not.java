package If_Else_Task;

import java.util.Scanner;

public class Task_016_Number_Is_Armstrong_Or_Not {
    public static void main(String[] args) {
        System.out.println("Enter a number to verify armstrong or not: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
   int compare_num=num,sum=0,last_digit=0;

        while(num>0)//loop execute until num become o
        {
         //to get last digit from number
            last_digit=num%10;
            //To remove last digit from number
            num=num/10;
            //To find armstrong number
            sum=sum+last_digit*last_digit*last_digit;
        }
if(sum==compare_num)
{
    System.out.println("Given number is armstrong");
}
else{
    System.out.println("Given number is not armstrong");
}

        }
    }

