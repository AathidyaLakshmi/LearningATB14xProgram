package Task;

import java.util.Scanner;

public class Task_16_Count_Word_In_String {
    public static void main(String[] args) {
        System.out.println("Enter a line:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter a word you want to search in given line: ");
        String search_str=sc.next().toLowerCase();
        //Remove all punctuation and other junk except spaces from given input string
        String clean_str=str.replaceAll("[^a-zA-Z ]","").toLowerCase();

        //Convert String into string array
        String[] str_arr=clean_str.split(" "); // Split string into word array according to spaces

        //Iterating through array and search for string
        int count=0;

        for(int i=0;i<str_arr.length;i++)
        {
            if(str_arr[i].equals(search_str)) {
                count++;
            }
        }


        System.out.println("number of time the word "+search_str+" occured in given input is: "+count);
    }
}
