package ex_13_Array;

import java.util.Arrays;

public class ex_96_Sort_Array_Elements_Using_Built_In_Method {
    public static void main(String[] args) {
        int a[]= {23,45,1,13,90};
        System.out.println("Array elements before sorting: "+ Arrays.toString(a));

        Arrays.sort(a);// This built in method sort the array on ascending order

        System.out.println("Array elements after sorting: "+Arrays.toString(a));

        String []str={"Gowthaman","Lakshmi","K","Aathidya","S"};
        System.out.println("String Array before sort: "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("String Array after sort: "+Arrays.toString(str));
    }
}
