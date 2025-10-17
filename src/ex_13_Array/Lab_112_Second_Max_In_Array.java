package ex_13_Array;

import java.util.Arrays;

public class Lab_112_Second_Max_In_Array {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        //Approach-By using built in method
       // Arrays.sort(numbers);
       // System.out.println(numbers[numbers.length - 2]);
        //Approach-2
        //to sort the number
        int temp=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Array after sort:"+Arrays.toString(numbers));
        System.out.println("second max element is :"+numbers[numbers.length-2]);

    }
}
