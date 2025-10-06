package Task;

import java.util.Scanner;

public class Task_07_Number_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to check palindrome or not:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int chk_num=num;
        int rev = 0;
        if (num == 0) {
            System.out.println("Reverse of " + num + " is " + num+ "hence it is palindrome");
        } else {
            while(num!=0){
                rev =rev*10+num%10;
                num=num/10;
            }
            System.out.println("Reverse of given number is " + rev);
            if(chk_num==rev)
            {
                System.out.println("Given number is palindrome");
            }
            else{
                System.out.println("Given number is not palindrome");
            }
        }
    }
}
