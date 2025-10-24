package If_Else_Task;

import java.util.Scanner;

public class Task_15_Check_Number_Palindrome_Or_Not {
    public static void main(String[] args) {

        System.out.println("Enter a number to verify it is palindrome or not: ");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int chk_num = num, rev_num = 0;
        //To reverse a number
        if (num == 0) {
            System.out.println("Palindrome of 0 is palindrome");
        } else {
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }
            if (chk_num == rev_num) {
                System.out.println("Given Number is palindrome");
            } else {
                System.out.println("Given number is not a palindrome");
            }
        }
    }
}
