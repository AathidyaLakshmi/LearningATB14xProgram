package ex_16_Functions;

public class Lab_132_User_Defined_Functions_Complete {
    /*
    * 1. without parameter without return type
    * 2. Without parameter with return type
    * 3. With parameter without return type
    * 4. With parameter with reyrn type
    * */
    public static void main(String[] args) {
//    Calling without parameter without return type func
        without_param_without_return();
   // Calling without parameter with return type function
   String name=without_param_with_return();
        System.out.println(name);
        //Calling With parameter without return type function
        with_param_without_return(4,5);
        //Calling With parameter with return type function
       double res= with_param_with_Return(10.67f,5.3f);
        System.out.println("Addition of two float is: "+res);
    }
    static void without_param_without_return()
    {
        System.out.println("Hi I am Without Parameter Without Return type function");
    }

    static String without_param_with_return()
    {
        System.out.println("Hi I am Without parameter with return type(string) function");
        return "Aathidya";
    }
    static void with_param_without_return(int a,int b)
    {
        System.out.println("Calling with parameter without return type function");
        System.out.println("Addition of two number is: "+(a+b));
    }
    static float with_param_with_Return(float a,float b)
    {
        System.out.println("Calling with Parameter with return type function");
        return a+b;
    }
}
