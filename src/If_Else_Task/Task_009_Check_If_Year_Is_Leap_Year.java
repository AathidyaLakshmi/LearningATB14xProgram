package If_Else_Task;

import java.util.Scanner;

public class Task_009_Check_If_Year_Is_Leap_Year {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        if (sc.hasNextInt()) {
            year = sc.nextInt();

if((year % 400 ==0) || ((year % 4==0) && (year % 100 !=0))){
    System.out.println(year+" is leap year");
}
else {
    System.out.println(year+" is not leap year");
}
        }else{
            System.out.println("Enter valid year");
        }
    }
}
