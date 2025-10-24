package If_Else_Task;

import java.util.Scanner;

public class Task_004_Check_Character_Vowel_Or_consonant {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        String alphabet = sc.next();
        if(alphabet.length()!=1){
            System.out.println("Enter a single character:");
        }
        else if(alphabet.length()==1){
           char alphabet1= alphabet.charAt(0);
           char alphabet2=Character.toLowerCase(alphabet1);
           if((alphabet2=='a')||(alphabet2=='e')||(alphabet2=='i')||(alphabet2=='o')||(alphabet2=='u'))
           {
               System.out.println("It is vowel");
           }
           else
           {
               System.out.println("It is consonant");
           }
        }else{
            System.out.println("Enter a valid Character input");
        }
    }
}
