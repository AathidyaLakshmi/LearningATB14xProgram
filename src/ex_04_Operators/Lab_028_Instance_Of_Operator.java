package ex_04_Operators;

public class Lab_028_Instance_Of_Operator {
    public static void main(String[] args) {
        String name = new String("Aathidya");
        int a=10;
       // System.out.println(name instanceof int);// gives error since it is used with non primitive type
        System.out.println(name instanceof String); //return true
    }
}
