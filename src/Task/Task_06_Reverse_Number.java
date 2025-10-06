package Task;

import java.util.Scanner;

public class Task_06_Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int rev = 0;
        if (num == 0) {
            System.out.println("Reverse of " + num + " is " + num);
        } else {
            while(num!=0){
                rev =rev*10+num%10;
                num=num/10;
            }
            System.out.println("Reverse of given number is " + rev);
        }
    }
}
