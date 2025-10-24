package If_Else_Task;

import java.util.Scanner;

public class Task_019_Bonus_Calculator {/*
Calculate Bonus Based on Salary and Years of Experience.
     :- take the salary and Year info from the User.
Implement Bonus Calculation Logic:
  Define the bonus structure based on salary and years of experience.
     :- If years of experience is less than 1 year: No bonus.
     :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
     :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
     :- If years of experience is greater than 6 years: Bonus is 15% of the salary
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
        System.out.println("Your year of Experience");
        float exp_year=sc.nextFloat();
        double bonus=bonus_calc(salary,exp_year);
        System.out.println("Your Bonus:"+bonus);
    }
    static double bonus_calc(double sal,float experience)
    {
        
        if(experience<1)
        {
            System.out.println("Sorry!! Your experience is less than a year.No bonus");
            return 0;
        } else if (experience>=1 && experience<=3) {
            return sal*5/100;
        } else if (experience>=4 && experience<=6) {
            return sal*10/100;
        }else if(experience>6){
            return sal*15/100;
        }
        else
        {
            return 0;
        }
    }
}
