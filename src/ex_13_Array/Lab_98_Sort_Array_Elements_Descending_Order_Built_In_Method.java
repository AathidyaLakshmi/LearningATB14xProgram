package ex_13_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab_98_Sort_Array_Elements_Descending_Order_Built_In_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array elements:" );
        int arr_size= sc.nextInt();
        Integer[] a= new Integer[arr_size];

        for (int i = 0; i < arr_size; i++) {
            System.out.println("Enter your "+i+" position element:");
            a[i]= sc.nextInt();
        }
        System.out.println("Array element before sorting:"+ Arrays.toString(a));
        //Built_In_Method-Logic
        Arrays.sort(a, Collections.reverseOrder());
        // To use this method we should declare Array datatype as derived datatpe
       System.out.println("Array element after sorting: "+Arrays.toString(a));
    }
}
