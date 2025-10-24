package If_Else_Task;

import java.util.Scanner;

public class Task_003_Max_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number1: ");
       num1=sc.nextInt();
       System.out.println("Enter number2: ");
       num2= sc.nextInt();
       if(num1>num2)
       {
           System.out.println(num1+" is maximum");
       } else if (num1==num2) {
           System.out.println("Both are equal");
       }else{
           System.out.println(num2+" is maximum");
       }
    }
}
