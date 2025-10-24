package If_Else_Task;

import java.util.Scanner;

public class Task_010_Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("Enter Student Name:");
        Scanner sc = new Scanner(System.in);
        String stu_name = sc.nextLine();
        System.out.println("Enter the number of subject");
        int total_subject = sc.nextInt();
        double total_marks = 0;
        for (int i = 1; i <= total_subject; i++) {
            System.out.println("Enter Subject " + i + " Mark:");
            int marks = sc.nextInt();
            total_marks = total_marks + marks;
        }
        double percentage = (total_marks / (total_subject*100))*100;
        String  grade =Grade_Calc(percentage);
        System.out.println("Your Grade: "+grade);

    }
    static String Grade_Calc(double percent) {
        if (percent >= 90 && percent <= 100) {
            return "A+";
        } else if (percent >= 80 && percent <= 89) {
            return "A";

        } else if (percent >= 70 && percent <= 79) {
            return "B";
        } else if (percent >= 60 && percent <= 69) {
            return "C";
        } else if (percent >= 50 && percent <= 59) {
            return "D";
        }
        else if (percent >= 40 && percent <= 49) {
            return "E";
        } else {
            return "You are fail!";
        }
    }
    }

