package ex_02_Java_Basics;

public class Char_As_Integral_DataType {
    public static void main(String[] args) {
        char c='A';
        System.out.println("Actual Character" +c);

        int unicode_value =c;// Implicitvconversion
        System.out.println("Unicode value of character"+c+" is:"+unicode_value);

        //we can even perform arithmetic operations here
        char next_character=(char)(c+1);
        System.out.println("Next Character:" +next_character);
    }
}
