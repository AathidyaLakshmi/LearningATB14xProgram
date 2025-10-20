package Task;

import java.util.Scanner;

public class Task_11_Reverse_A_String {
    public static void main(String[] args) {
        //String Reverse without using Inbuilt Function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String U want to reverse");
        String str=sc.nextLine();
        //Converting String to Array
        char[] a=str.toCharArray();
        String revStr="";
        //Reversing an array using for loop
        for(int i=a.length-1;i>=0;i--)
        {
            revStr=revStr+a[i];
        }
        System.out.println("Reversed String:"+revStr);
    }
}
