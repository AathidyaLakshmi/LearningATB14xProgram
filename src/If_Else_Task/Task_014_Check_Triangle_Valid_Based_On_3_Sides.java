package If_Else_Task;

import java.util.Scanner;

public class Task_014_Check_Triangle_Valid_Based_On_3_Sides {
    /*condition-1: All three sides length should be >0
    * condition-2: sum of any two side> third side
    *   a+b>c
    * a+c>b
    * b+c>a
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1:");
        int side1= sc.nextInt();

        System.out.println("Enter side2:");
        int side2= sc.nextInt();

        System.out.println("Enter side3:");
        int side3= sc.nextInt();


        if(side1>0 && side2>0 && side3>0)
        {
            if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1)
            {
                System.out.println("The triangle is valid");
            }
            else {
                System.out.println("Triangle is invalid");
            }
        }
        else{
            System.out.println("All three sides should be greater than 0");
        }
    }
}
