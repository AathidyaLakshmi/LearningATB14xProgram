package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex_95_Number_Of_Times_Element_Duplicate {
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
        System.out.println("Enter the number you want search:");
        int search_element=sc.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++)
        {

                if(a[i]==search_element)
                {

                    count++;

                }

        }
        System.out.println("Number of time the element is duplicated: "+count);
        }
    }

