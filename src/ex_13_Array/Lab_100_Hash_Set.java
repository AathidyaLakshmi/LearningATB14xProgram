package ex_13_Array;

import java.util.HashSet;

public class Lab_100_Hash_Set {
    public static void main(String[] args) {
        //Hash set does not accept duplicate values
        //It can accept only unique values
        String[] arr={"Java","C","C#","Python","Java"};
        //Declaring Hash set
        HashSet <String> langs = new HashSet();
        // add array arr value one by one to hash set
        for(String str:arr)
        {
            System.out.println(langs.add(str));// add the values one by one .
            //If it duplicate value then insertion failed by returning false
        }
/*Print
* true
true
true
true
false
*/
    }
}
