package ex_13_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex_99_Sort_Array_Elements_Descending_Order_For_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:" );
        int arr_size= sc.nextInt();
        int[] a= new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            System.out.println("Enter your "+i+" position element:");
            a[i]= sc.nextInt();
        }
        System.out.println("Array element before sorting:"+ Arrays.toString(a));
        //Logic to sort[bubble sort]

        for (int i = arr_size-1; i>=0; i--) // get last element in array to compare
        {
            for(int j = i-1;j>=0;j--)
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
