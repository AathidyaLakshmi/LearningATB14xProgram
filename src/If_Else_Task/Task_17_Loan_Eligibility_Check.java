package If_Else_Task;

import java.util.Scanner;

public class Task_17_Loan_Eligibility_Check {
    /* Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
        Take the below User info and store it into the variables:
            Age (integer),Salary (double or float),Credit Score (integer)
    Age Validation:
              :- Check if the age is a positive integer
              :- Ensure the age is at least 18 years old.
              :- Max age can be 80.
    Salary Validation:
              :- Check if the salary is a positive number.
              :- Define a minimum salary threshold (e.g., 30,000).
    Credit Score Validation:
              :- Check if the credit score is a positive integer.
              :- Define a minimum credit score threshold (e.g., 650).
              :- Max credit score threshold (e.g., 850).

*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String age_check = Eligiblity_Check_Age(sc, "Enter your age");

        String salary_check = Eligiblity_Check_Salary(sc, "Enter your salary:");

        String credit_score_check=Eligibility_Check_Credit_Score(sc,"Enter your credit score");

        if(age_check.equalsIgnoreCase("age check passed") && salary_check.equalsIgnoreCase("salary check passed") && credit_score_check.equalsIgnoreCase("Credit Score check passed"))
        {
            System.out.println("Congratulations!! You are eligible for loan");
        }
        else{
            System.out.println("Validation check  details");
            System.out.println(age_check);
            System.out.println(salary_check);
            System.out.println(credit_score_check);
            System.out.println("Sorry!! You are not eligible for loan");
        }

    }


    static String Eligiblity_Check_Age(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            String age_status = age > 0 ? (age >= 18 && age <= 80 ? "Age check passed" : "Your age should be above 18 and below 80 to get loan") :
                    "Enter valid age above 0 ";
            return age_status;
        } else {
            return "Enter valid age in number(integer)";
        }
    }

    static String Eligiblity_Check_Salary(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            double salary = sc.nextDouble();
            String salary_status = salary > 0 ? (salary >= 30000 ? "Salary check passed" : "Your salary should be above 30000 to get loan")
                    : "Enter valid salary above 0";
            return salary_status;
        } else {
            return "Enter salary in number";
        }
    }
    static String Eligibility_Check_Credit_Score(Scanner sc,String prompt)
    {
        System.out.println(prompt);
        if(sc.hasNextInt()){
            int credit_score= sc.nextInt();
            String credit_score_status=credit_score>0?(credit_score>=650 && credit_score<=850)?"Credit Score check passed":"Credit Score should be greater than 650 and less than 850"
                                                     :"Enter credit score value above 0";
            return credit_score_status;
        }else{
            return "Enter credit score in number";
        }
    }
}
