package ex_13_Array;

import java.util.Scanner;

public class ex_92_Sum_Of_Element_In_An_Array {
    public static void main(String[] args) {

        System.out.println("Enter the size of 1d-Array:");
        Scanner sc=new Scanner(System.in);
        int arr_size=sc.nextInt();
        int[] a=new int[arr_size];
//Getting values for array
        for (int i = 0; i < arr_size ; i++) {
            System.out.println("Enter your value for "+i+"th position ");
            a[i]=sc.nextInt();
        }
    // Print value ro console
        System.out.println("Array values you entered ");
        for (int i = 0; i < arr_size; i++) {
            System.out.println(a[i]);
        }
        // Logic for sum of element
        int sum=0;
        for (int i = 0; i < arr_size; i++) {

            sum=sum+a[i];
        }
        System.out.println("Sum of all the elements:"+sum);

    }
}
