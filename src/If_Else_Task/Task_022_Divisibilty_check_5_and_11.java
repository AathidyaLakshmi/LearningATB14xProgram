package If_Else_Task;

import java.util.Scanner;

public class Task_022_Divisibilty_check_5_and_11 {
    public static void main(String[] args) {
        System.out.println("Enter a number to verify it is divisible by 5 and 11");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String status=(num%5==0)?"The given number "+num+" is divisible by 5"
                                :(num%11==0)?"The given number "+num+" is divisible by 11"
                                            :"The number is not divisible by both 5 and 11";
        System.out.println(status);
    }
}
