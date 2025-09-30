package ex_04_Operators;

public class Lab_019_Relational_Operator {
    public static void main(String[] args) {
        int age_akil=26,age_sunil=30;

        //RELATIONAL OPERATOR ALWAYS RETURN BOOLEAN VALUE

        boolean c = age_akil > age_sunil;

        System.out.println(c); // return false

        c=age_akil<age_sunil;
        System.out.println(c); // return true


        int a=10,b=10;

        c=a!=b;
        System.out.println(c); // return false

        boolean d = a==b;
        System.out.println(d); // return true

        /*Other than this we have <= and >= operator are there*/




    }
}
