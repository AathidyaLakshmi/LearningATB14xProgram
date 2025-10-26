package If_Else_Task;

import java.text.MessageFormat;
import java.util.Scanner;

public class Task_023_Days_Convert_to_Year_Month_Day {

    /*Assume 1 year=365 days  1 month=30 days   */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int tot_days = read_Int_check(sc,"Enter number of days u want to print in year month and days format");
        Year_Month_Day_Calc(tot_days);
    }

    static int read_Int_check(Scanner sc,String str)
    {
        System.out.println(str);
        if(sc.hasNextInt())
        {

            return sc.nextInt();
        }
        else
        {
            System.out.println("Enter valid input in integer");
            return 0;
        }
    }
    static void Year_Month_Day_Calc(int total_days)
    {
        int year=total_days/365;

        total_days=total_days%365;//to get remaining days to calculate month

        int month= total_days/30;

        total_days=total_days%30; //to get remaining days to calculate days

        int week=total_days/7;

        int days=total_days%7; //to get remaining days after week

        System.out.println(+year+ " years "+month+" Months "+week+" Weeks "+days+" days ");


    }
}
