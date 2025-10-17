package ex_14_Strings;

public class Lab_119_Interview_String {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String => this check the ref location
        System.out.println(s1 == s3); //s1 is in pool and s3 is in heap memory. both has diferent reference prints false
        System.out.println(s1 == s2);//s1 is in pool and s2 is in heap memory. prints false
        System.out.println(s2 == s3);
        //s2 points to different location in Heap memory
// s3 points to different location in heap memory
        //so print false
        System.out.println(s1 == s4); // prints true
        System.out.println(s3 == s5); // prints false

        // equals ( content) -> value
        System.out.println(s1.equals(s2)); // compare the content in s1 and s2. prints true
        System.out.println(s1.equals(s3)); // compare the content in s1 and s3. prints true
        System.out.println(s3.equals(s5)); // print false.. since its case sensitive
        System.out.println(s3.equalsIgnoreCase(s5)); //prints true since we are calling ignore case method

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

    }
}
