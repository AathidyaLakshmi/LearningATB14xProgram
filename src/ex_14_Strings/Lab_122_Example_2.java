package ex_14_Strings;

import java.util.Arrays;

public class Lab_122_Example_2 {
    public static void main(String[] args) {
        String s= "Java".substring(2);
        System.out.println(s); //prints va

        String s1="Java".substring(1,3);
        System.out.println(s1);//prints av

        char[] arr="Java".toCharArray(); //Convert string into char array
        System.out.println(Arrays.toString(arr)); // prints [J,a,v,a]

        String s2=" Java ".trim(); //this method remove extra spaces
        System.out.println(s2);

        boolean b= " ".isBlank();
        System.out.println(b); //print true

        String s3="ab".repeat(3); //repeat ab 3 times
        System.out.println(s3);//ababab

        boolean b1="Java".equalsIgnoreCase("java");
        System.out.println(b1);// prints true

        long count="a\nb\nc".lines().count();
        System.out.println(count);// line count 3
    }
}
