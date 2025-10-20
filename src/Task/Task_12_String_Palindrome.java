package Task;

import java.util.Scanner;

public class Task_12_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        String revStr="";
        char[] arr=str.toCharArray();
        for(int i= arr.length-1;i>=0;i--)
        {
            revStr=revStr+arr[i];
        }
        System.out.println("Reversed String: "+revStr.toString());

        if(str.equalsIgnoreCase(revStr))
        {
            System.out.println("Entered String is Palindrome");
        }
        else
            System.out.println("Entered String is not a Palindrome");
    }
}
