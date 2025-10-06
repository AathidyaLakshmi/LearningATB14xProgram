package Task;

import java.util.Scanner;

public class Task_08_Count_Number_Of_Digit {
    public static void main(String[] args) {
        System.out.println("Enter a number to count:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int count = 0;
        if (num == 0) {
            System.out.println("Since the entered number is 0 the digit count is 1");
        } else {
            while(num!=0){
                num=num/10;
                count++;
            }
            System.out.println("Digit count " + count);
        }
    }
}
