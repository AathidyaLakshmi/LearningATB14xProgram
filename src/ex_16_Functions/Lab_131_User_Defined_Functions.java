package ex_16_Functions;

import java.util.Scanner;

public class Lab_131_User_Defined_Functions {
    public static void main(String[] args) {
        int result=sum_of_two_numbers(4,3);
        //Instead of hardcoding we get input from console during run time pass the input to functions and show the result to console again
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter first number: \t");
        int a= sc.nextInt();

        System.out.printf("\n Enter second number: \t");
        int b= sc.nextInt();

        int result1=sum_of_two_numbers(a,b);
        System.out.println("Addition of user input number:"+result1);

        System.out.println("Addition of hardcoded value 4 & 3 is:" +result);

        //Calling non return type functions
        sum_of_two_numbers();
    }
    static int sum_of_two_numbers(int a,int b)
    {
        return a+b;
    }
    static void sum_of_two_numbers()
    {
        System.out.println("Calling non return type functions");
    }
}
