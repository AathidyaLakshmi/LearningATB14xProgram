package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_93_Find_Even_Odd_In_Array {
    public static void main(String[] args) {
        System.out.println("Enter number of elements in array:");
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] a = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            System.out.println("Enter the value for " + i + "th position:");
            a[i] = sc.nextInt();
        }
        //Print elements in array using BUILT-IN METHOD
        System.out.println("Array elements are:" + Arrays.toString(a));
        int even = 0, odd = 0;
        //Logic for odd or even
        for (int i = 0; i < arr_size; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
                even++;
            } else {
                System.out.println(a[i] + " is odd");
                odd++;
            }
        }
        System.out.println("Number of even: "+even+"\n Number of Odd: "+odd );
    }
}
