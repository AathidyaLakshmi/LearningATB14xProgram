package Task;

import java.util.Scanner;

public class Task_15_Count_Character_In_String {
    public static void main(String[] args) {
        System.out.println("Enter a line/word: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter a character you want to count in a string:");
        char search_char=sc.next().charAt(0);
        char[] a=str.toCharArray();
        int count=0;
        for(int i=0;i<=str.length()-1;i++)
        {
            if(a[i]==search_char)
            {
                count++;
            }
        }
        System.out.println("Character count of "+search_char+" in given line/word is: "+count);

    }
}
