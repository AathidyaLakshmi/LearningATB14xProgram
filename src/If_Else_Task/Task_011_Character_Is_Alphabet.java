package If_Else_Task;

import java.util.Scanner;

public class Task_011_Character_Is_Alphabet {
    public static void main(String[] args) {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an alphabet (a to z) or(A to Z): ");
        char ch='\0';
        boolean flag=false;
        input=sc.next();
        if(input.length()==1)
        {
            ch= input.charAt(0);

        }
        else{
            System.out.println("Enter a valid single character");

        }
//if(flag==true)
        //Using Logic
//{
        if((ch >='a' && ch<='z') || (ch>='A'&& ch<='Z') ) //Here it checks for ASCII Values
        {
            System.out.println("Entered Character "+input+" is an alphabet");
        }
        else{
            System.out.println("Entered input is not an alphabet");
        }

    }
    }


