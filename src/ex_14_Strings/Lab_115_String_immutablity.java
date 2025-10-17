package ex_14_Strings;

public class Lab_115_String_immutablity {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat("World"); //Even though we concatenated it will not get printed because there is no reference variable
        //to hold the address of this concatenated string
        System.out.println(s);//prints Hello

        s=s.concat("World"); //now we assign reference variable s to point concatenated string
        //so it take out existing reference and now points to new reference
        System.out.println(s); // prints "Hello World"
    }
}
