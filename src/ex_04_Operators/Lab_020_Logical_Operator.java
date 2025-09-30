package ex_04_Operators;

public class Lab_020_Logical_Operator {
    public static void main(String[] args) {
        //LOGICAL OPERATOR RETURN BOOLEAN VALUE AS RESULT
        boolean c=true&&false;
        System.out.println(c); // return false

        c=true||false;
        System.out.println(c); // return true

        boolean a=true;
        System.out.println(!a); // return false
        System.out.println(!!a); //return true

    }
}
