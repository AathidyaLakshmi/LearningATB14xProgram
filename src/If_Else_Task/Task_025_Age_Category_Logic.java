package If_Else_Task;

import java.util.Scanner;

public class Task_025_Age_Category_Logic {
    /*
    * Find if a Person is Senior Citizen Based on Age.
:- take the age input from the user.
Implement Age Category Logic:
Define the criteria for different age categories:
Child: Age 0 to 12
Teenager: Age 13 to 19
Adult: Age 20 to 64
Senior Citizen: Age 65 and older*/
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        int age=0;
        if(sc.hasNextInt()) {
            age = sc.nextInt();
        }
        else{
            System.out.println("Enter your age in number");
        }

       /* if(age >=0 && age<=12)
        {
            System.out.println("You are Child");
        } else if (age>=13 && age<=19) {
            System.out.println("You are teenager");
        } else if (age>=20 && age<=64) {
            System.out.println("You are Adult");
        }else if(age>=65)
        {
            System.out.println("You are Senior Citizen");
        }*/
        //using Ternary Operator
        String message=(age>=0 && age <=12)?"You are child"
                                           :(age>=13 && age<=19)?"You are teenager"
                                           :(age>=20 && age<=64)?"You are adult"
                                           :(age>=65)?"You are senior citizen":"Please enter valid integer";
        System.out.println(message);


    }
}
