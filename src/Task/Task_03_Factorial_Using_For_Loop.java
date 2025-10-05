package Task;

import java.util.Scanner;

public class Task_03_Factorial_Using_For_Loop {
    public static void main(String[] args) {
        // calculate the factorial of a number
        System.out.println("Enter a number you want to find factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==0){
             fact=1;
        }
        else {
            for (int i = 1; i <= n; i++) {

                fact = fact * i;

            }

            System.out.println("Factorial of given number is: " + fact);

            /*
            we can also code this way too
            for(i=n;i>=1;i--){
            fact=fact*i;
            }
             */
        }
    }
}
