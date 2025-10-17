package ex_13_Array;

public class Lab_110_String_Is_Char_Array {
    public static void main(String[] args) {
        String name="Aathidya";
        String[] s=name.split(""); //makes the string to char array
        //["A","a","t","h","i","d","y","a"]
        // To read this array we can make use of either for loop or enhanced for loop
        for(String arr:s)
        {
            System.out.println(arr);
        }
    }
}
