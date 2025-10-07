package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_085_Interview_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find factorial:");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Enter proper integer value:");
        } else {
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("fact = 1");
            }
            if (num < 0 || num > Integer.MAX_VALUE) {
                System.out.println("Cant get the factorial as it is out of bound");
            } else {
                int fact = 1;

                while (num >= 1) {
                    fact = fact * num;
                    num--;
                }
                System.out.println("factorial of given number is: " + fact);
            }
        }
    }
}


