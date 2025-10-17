package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_102_Max_And_Min_Number_In_Array {
    public static void main(String[] args) {
        //To find Max and Min Number in an array
        //Step-1: Sort the array elements in either ascending or descending order and min and max
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of elements in array:");
        int arr_size= sc.nextInt();
        int[] a= new int[arr_size];
        for (int i = 0; i <arr_size ; i++) {
            System.out.print("Enter element for "+i+" position:");
            a[i]=sc.nextInt();
            System.out.println();
        }
        //To sort the array elements in Ascending order
        int temp=0;
        for(int i=0;i<arr_size;i++)
        {
            for(int j=i+1;j<arr_size;j++)
            {
                temp = a[i];
                a[i]=a[j];
                a[j]= temp;
            }
        }
        System.out.println("Sorted Array "+ Arrays.toString(a));
        System.out.println("Largest Number: "+a[0]);
        System.out.println("Smallest Number: "+a[arr_size-1]);

    }
}
