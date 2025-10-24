package If_Else_Task;

import java.util.Scanner;

public class Task_007_Smallest_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number 1:");
        num1=sc.nextInt();
        System.out.println("Enter number 2:");
        num2=sc.nextInt();
        if(num1<num2)
            System.out.println(num1+" is smallest");
        else if (num1==num2) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println(num2+" is smallest");
        }
    }
}
