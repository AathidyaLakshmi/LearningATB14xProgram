package ex_14_Strings;

public class Lab_113_String_Immutable {
    public static void main(String[] args) {
        String name="Aathi";
        name.toUpperCase();
        //Eventhough String "Aathi" changed to "AATHI" in SCP. No variable points to "AATHI"
        //name points to "Aathi". so if we print name
        System.out.println(name); //prints "Aathi"

        //To print the Uppercase letter we need one new reference variable points to "AATHI"
        String name_new_reference= name.toUpperCase();
        System.out.println(name_new_reference); //prints "AATHI"

        //Result: We cant change the original vale of a variable like we did in arrays Arrays.sort(a);
        //It sort the array a values and stored in same array
    }
}
