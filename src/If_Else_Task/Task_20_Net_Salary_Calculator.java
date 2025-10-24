package If_Else_Task;

import java.util.Scanner;

public class Task_20_Net_Salary_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double basic_pay,hra_percent,da_percent,deduction_percent;
        System.out.println("Enter your basic pay:");
        basic_pay= sc.nextDouble();
        System.out.println("Enter your HRA in %");
        hra_percent=sc.nextDouble();
        System.out.println("Enter your DA in %");
        da_percent=sc.nextDouble();
        System.out.println("Enter your deduction in %");
        deduction_percent= sc.nextDouble();
        //to calculate HRA
        double hra=(hra_percent/100)*basic_pay;
        //to calculate DA
        double da=(da_percent/100)*basic_pay;
        //to calculate deduction
        double deduction=(deduction_percent/100)*basic_pay;
        double net_salary=basic_pay+hra+da-deduction;
        System.out.println("Basic Pay:"+basic_pay);
        System.out.println("HRA:"+hra);
        System.out.println("DA"+da);
        System.out.println("Deductions:"+deduction);
        System.out.println("Your Net Pay:"+net_salary);
    }
    /*20)  Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Research from your side for this program.  */
}
