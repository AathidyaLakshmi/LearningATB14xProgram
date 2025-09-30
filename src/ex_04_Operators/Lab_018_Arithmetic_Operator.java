package ex_04_Operators;

public class Lab_018_Arithmetic_Operator {
    public static void main(String[] args) {
        int a=7,b=5,c;
        c=a+b;// perform addition operation
        System.out.println("Add: "+c);

        c=a-b; // perform subtraction operation
        System.out.println("Sub: "+c);

        c=a*b;  // perform multiplication operation
        System.out.println("Mul: "+c);

        c=a/b; // perform division and return quotient in c
        System.out.println("Division: "+c);

        c=a%b;  //perform division and return remainder value in c
        System.out.println("Modulus:"+c);
    }
}
