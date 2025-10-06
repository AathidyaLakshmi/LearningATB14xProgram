package Task;

import java.util.Scanner;

public class Task_10_Sum_Of_Digit {
    public static void main(String[] args) {
        System.out.println("Enter number to sum: ");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        int digit=0,sum=0;
        while(num>0)
        {
            digit = num%10;
            num=num/10;
            sum=sum+digit;
        }
        System.out.println("Sum of given number is:"+sum);
    }
}
