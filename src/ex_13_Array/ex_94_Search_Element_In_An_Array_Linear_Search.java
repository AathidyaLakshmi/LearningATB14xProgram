package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex_94_Search_Element_In_An_Array_Linear_Search {
    //This linear search method not care about duplicate elements
    // If match found it exit from the loop
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
        // Logic
        boolean status = false;
        for (int i = 0; i < a.length; i++)//Pick first element
        {
            for (int j = i + 1; j < a.length; j++)//pick next element
            {
                if (a[i] == a[j]) // Compare two elements
                {
                    System.out.println("Duplicate found:" + a[i]);
                    status = true;
                    break;
                }
            }
        }
        if (status == false) {
            System.out.println("Duplicate not found");

        }
    }
}
