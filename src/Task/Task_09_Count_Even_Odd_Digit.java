package Task;

import java.util.Scanner;

public class Task_09_Count_Even_Odd_Digit {
    public static void main(String[] args) {
        //Count number of even and odd digit in a number
        System.out.println("Enter a number to count even and odd digit:");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        scanner.close();
        int a=0,even_count=0,odd_count=0;
        if(num<0){
            // handle negative integer
            num=-num;
        } else if (num==0) {//handle 0
            System.out.println("The entered number  0 is even");

        }else{
            while(num>0)
            {
                a=num%10;

                if(a%2==0) {
                   even_count++;
                }
                else {
                    odd_count++;
                }
                num=num/10;
            }
            System.out.println("Even count " + even_count);
            System.out.println("Odd Count: "+odd_count);
        }
    }
}
