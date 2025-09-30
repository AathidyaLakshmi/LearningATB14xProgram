package ex_07_Increment_And_Decrement_Operator;

public class Lab_042_Pre_Increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a ->  a = a+1 , increment by 1

        //  Exp and Result Table
        // Line No | a | Result b
        // 5  |  10 |  NA
        // 6 |  11 | 11
        // 7  | 11 - print | 11
        // 8   | 11 | 11 - print
    }
}
