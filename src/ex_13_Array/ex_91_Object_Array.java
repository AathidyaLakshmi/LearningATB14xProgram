package ex_13_Array;

public class ex_91_Object_Array {
    public static void main(String[] args) {
        // This object array holds all types of values as Strings
        // So if we want to read and use any values from object we should convert to corresponding type

        //Declaration And Adding values
        Object a[]={"Aathidya","Lakshmi", 'K','S',123,48.9};
        //To read data from object array
        //Approach-1
        for(Object value:a)
        {
            System.out.println(value);
        }
        //Approch 2
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
