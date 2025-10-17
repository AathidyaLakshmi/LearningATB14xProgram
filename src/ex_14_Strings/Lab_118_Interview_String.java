package ex_14_Strings;

public class Lab_118_Interview_String {
    public static void main(String[] args) {
        //Q:How many strings are there in memory

        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        //String s11 = "hello";
// Aboove s1,s4,s10,s11 reference variable points to same object "Hello" in SCP.
        //In this case only one string "Hello" available in SCP
        //If we add s11, then we have 2 strings "Hello" and "hello" in SCP

        // 2

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //In this case each reference variable s2,s3,s5 points to 3 different places
        // in heap memoru. here we have 'new' keyword to create objects in heap memory;
        //Everytime new object get created
        //HERE WE HAVE 3 STRINGS
    }
}
