package If_Else_Task;

import java.util.Scanner;

public class Task_006_Largest_Of_Three_Numbers {
    public static void main(String[] args) {
        int[] num = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            
            System.out.println("Enter number:");

            if (sc.hasNextInt()) {
                num[i] = sc.nextInt();
            } else {
                System.out.println("Enter Valid Integer");
                break;
            }
        }
        if (num[0] > num[1] && num[0] > num[2]) {
            System.out.println(num[1] + " is largest");
        } else if (num[1]>num[0] && num[1]>num[2]) {
            System.out.println(num[1]+" is largest");
        }
        else {
            System.out.println(num[2]+" is largest");
        }

    }
}
