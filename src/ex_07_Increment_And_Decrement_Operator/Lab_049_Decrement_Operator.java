package ex_07_Increment_And_Decrement_Operator;

public class Lab_049_Decrement_Operator {
    public static void main(String[] args) {
        int a = 10;
        int result_post = a--; // decrement the value a but it is not assigned
        System.out.println(result_post); // print 10
        System.out.println(a); //9
    }
}
