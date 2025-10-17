package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_97_Sort_Array_Elements_Ascending_Order_Using_For_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:" );
        int arr_size= sc.nextInt();
        int[] a= new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            a[i]= sc.nextInt();
        }
        System.out.println("Array element before sorting:"+ Arrays.toString(a));
        //Logic to sort[bubble sort]

        for (int i = 0; i < arr_size; i++) // get first element in array to compare
        {
            for(int j=i+1;j<arr_size;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }

        }
        System.out.println("Array elements after sorting: "+Arrays.toString(a));
    }
}
