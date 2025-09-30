package ex_08_If_Condition;

public class Lab_051_If_Condition_Using_CLI {
    public static void main(String[] args) {
        String user_input = args[0]; // Getting input from CLI

        int age = Integer.parseInt(user_input); //Converting String input to Integer
        if (age > 18) {

            System.out.println("Yes! you are eligible to vote");
        } else {
            System.out.println("Sorry! you are not eligible to vote");
        }

    }
}