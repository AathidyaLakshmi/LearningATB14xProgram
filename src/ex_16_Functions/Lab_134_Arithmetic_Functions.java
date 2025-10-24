package ex_16_Functions;

import java.util.Scanner;

public class Lab_134_Arithmetic_Functions {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)
        //both a nd b is integer

        Scanner sc = new Scanner(System.in);
        int a = read_Int(sc, "Enter Num1:");
        int b = read_Int(sc, "Enter num2:");

        int sum = sum(a, b);
        int sub = sub(a, b);
        int mul = mul(a, b);
        int div = div(a, b);
        int mod = mod(a,b);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: "+mod);
    }

    //Function to read integer from user input
    static int read_Int(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Enter Integer number");
            System.exit(0);
            return 0;
        }

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return  a-b;

    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static int div(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Division by 0 is not allowed");
        }
        return a/b;
    }
    static  int mod(int a,int b)
    {
        return a%b;
    }


}
