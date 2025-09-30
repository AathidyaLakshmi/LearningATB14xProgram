package ex_07_Increment_And_Decrement_Operator;

public class Lab_043_Post_Increment {
    public static void main(String[] args) {
        // POST increment  = Print first and then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 6  |  10 | NA
        // 7  |  11  | 10
        // 8  |  11  print| 10
        // 9  | 11 | 10 print


    }
}
