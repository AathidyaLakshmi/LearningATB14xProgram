package If_Else_Task;

import java.util.Scanner;

public class Task_021_Travel_Eligibility_Based_On_Age_Visa {
    /*Find if a Person Can Travel Based on Visa Status and Age.
  take the input from the user for
     Age (integer).
     Visa Status (String or boolean).
Check Eligibility:
   :- If age is 18 or older and visa status is valid, the person can travel.
Otherwise, the person cannot travel.
Validation Criteria
    Age: - Must be a non-negative integer.
     :- Should be greater than or equal to 18 to be eligible to travel.
    Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
   :- You can also use a boolean where true indicates a valid visa and false indicates an invalid

*/
    public static void main(String[] args) {
        int age=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        if(sc.hasNextInt())
        {
            age=sc.nextInt();
        }
        else {
            System.out.println("Enter valid integer");
        }
        System.out.println("Enter your Visa status(valid/Invalid)");
        String visa_status= sc.next().toLowerCase();
        if(age<0)
        {
            System.out.println("Enter valid age");
        } else if (age>=0 && age<18 || visa_status.equalsIgnoreCase("invalid")) {
            System.out.println("Sorry!! You are not eligible to travel!!");
        } else if (age>=18 && (visa_status.equalsIgnoreCase("valid"))) {
            System.out.println("Congratulations!! You are eligible to travel");
        }


    }
}
