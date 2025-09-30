package ex_03_Literals;

public class Lab_014_Integral_Literal {
    public static void main(String[] args) {
        byte b=1;
        short s=10;
        char c1='A'; //Unicode value of A store in c1
        int i=583;
        long l=999456876L;

        // Special concern for Char Literal
        /*
        * Any alphabet, symbol,blank space, number newline, tabline,
        * back space,carriage return can be character.
        * since it stores only unicode value of a character
        * */
        char c2='(';
        char c3='/';
        char c4='2';
        char c5=' ';
        char c6='\n';
        char c7='\t';
        char c8='\b';
        char c9='\r';
        System.out.println("Aathidya"+c6+"Lakshmi");
        System.out.println("Aathidya"+c7+"Lakshmi");
        System.out.println("Aathidya"+c8+"Lakshmi");
        System.out.println("Aathidya"+c9+"Lakshmi");




    }
}
