package Task;

import java.util.Scanner;

public class Task_14_Remove_White_Spaces_In_A_String {
    public static void main(String[] args) {
        System.out.println("Enter a line with spaces");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNext()){
            String str= sc.nextLine();
            System.out.println("Your input: "+str);
            String rem_space_str= str.replaceAll("\\s","");
            System.out.println("Output without spaces: "+rem_space_str);

        }
        else {
            System.out.println("Enter a valid input");
        }
    }
}
