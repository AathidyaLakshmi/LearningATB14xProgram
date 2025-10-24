package If_Else_Task;

import java.util.Scanner;

public class Task_18_Electricity_Bill_Calculation {
    /*Electricity Bill Calculation (Based on Units Consumed)
    :- take the input from the user of Units.
Implement Rate Structure:
Define the rate structure for calculating the bill based on the number of units consumed.
    :-  First 100 units: 0.50Rs per unit
    :-  Next 100 units (101-200): 0.75Rs per unit
    :- Next 100 units (201-300): 1.20Rs per unit
    :- Above 300 units: 1.50Rs per unit*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=read_Int(sc,"Enter usage in units:");
        double charges=Electricity_Bill_Calc(unit);
        System.out.println("Your bill:" +charges);

    }
    static int read_Int(Scanner sc,String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt())
        {
            return sc.nextInt();
        }
        else{
            System.out.println("Enter valid usage in integer");
            return 0;
        }
    }
    static double Electricity_Bill_Calc(int unit)
    {
        if(unit>0 && unit<=100)
        {
            return unit*0.50f;
        }
        else if(unit>=100 && unit<=200)
        {
            return 100*0.50f+(unit-100)*0.75f;
        }
        else if(unit>=200 && unit<=300)
        {
            return 100*0.50f+100*0.75f+(unit-200)*1.20f;
        }
        else if(unit>=300)
        {
            return 100*0.50f+100*0.75f+100*1.20f+(unit-300)*1.50f;
        }
        else{
            System.out.println("Enter valid usage of unit above 0");
            return 0;
        }
    }
}
