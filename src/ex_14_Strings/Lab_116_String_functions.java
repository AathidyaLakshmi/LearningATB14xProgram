package ex_14_Strings;

public class Lab_116_String_functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);

        String s1 = "ABCD";
        System.out.println(s1);
        System.out.println(s1.length()); // print 4
        System.out.println(s1.toLowerCase()); // print abcd
        System.out.println(s1.toUpperCase()); // print ABCD
        System.out.println(s1.concat("E")); // print ABCDE
    }
}
