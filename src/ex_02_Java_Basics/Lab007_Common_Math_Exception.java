package ex_02_Java_Basics;

public class Lab007_Common_Math_Exception {
    public static void main(String[] args) {
        System.out.println(10/0);
        // Throw exception
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at ex_02_Java_Basics.Lab007_Common_Math_Exception.main(Lab007_Common_Math_Exception.java:5)
    }
}
