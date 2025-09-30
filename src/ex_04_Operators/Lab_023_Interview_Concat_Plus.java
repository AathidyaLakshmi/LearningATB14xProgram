package ex_04_Operators;

public class Lab_023_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a=10,b=10;
        String first_name="Aathidya", second_name="Lakshmi";

        System.out.println(first_name+second_name+a+b);// print Aathidyalakshmi1010

        System.out.println(a+b+first_name+second_name); // print 20AathidyaLakshmi

        System.out.println(first_name+second_name+(a+b)); // this time print AathidyaLakshmi20
    }
}
