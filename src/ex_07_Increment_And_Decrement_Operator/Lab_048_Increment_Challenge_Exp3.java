package ex_07_Increment_And_Decrement_Operator;

public class Lab_048_Increment_Challenge_Exp3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a); //11+12=23 print 23
        System.out.println(a); //print 12

        // ++a -> A -> ExpA -> 11 , a -> 11
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12
    }
}
