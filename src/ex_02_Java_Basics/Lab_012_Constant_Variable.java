package ex_02_Java_Basics;

public class Lab_012_Constant_Variable {
    public static void main(String[] args) {
        int i = 10;
        i = 11;
        System.out.println(i);
        //no error java compiler easily replace i value from 10 to 11;
        final int j= 12;
        // j = 13;
        /*
         * if we try to change value of j java compiler generate
         error " cannot assign a value to final variable j" since it is constant

         */

    }
}
