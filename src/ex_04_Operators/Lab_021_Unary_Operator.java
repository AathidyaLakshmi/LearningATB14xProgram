package ex_04_Operators;

public class Lab_021_Unary_Operator {
    public static void main(String[] args) {
        /* Unary Operator
        * Mathematical operations performed using single operand
        * */
        int a=5;boolean flag=true;
        //unary plus
        System.out.println(+a);
        //unary minus
        System.out.println(-a);

        //Increment and decrement operator
        System.out.println(++a);// prints 6

        System.out.println(a++);//prints 6 and then increment by 1 to 7

        System.out.println(a--); // print 7 and then decrement by 1 to 6

        System.out.println(--a); // decrement by 1 from 6 to 5 and print 5

        //LOGICAL NOT
        System.out.println(!flag);
    }
}
