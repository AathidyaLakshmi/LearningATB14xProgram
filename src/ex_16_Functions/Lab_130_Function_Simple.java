package ex_16_Functions;

public class Lab_130_Function_Simple {


    public static void main(String[] args) {
        Non_Return_Func();
        String name=string_return_func();
        System.out.println(name);

        int i=Integer_Return_Func();
        System.out.println(i);

        boolean status=Boolean_Return_Func();
        System.out.println(status);



    }
    //Non-Return-Func
    static void Non_Return_Func()
    {
        System.out.println("Hi I have not return anything");
    }
    //Return func can return anything int,long,char,float,double,string,boolean
    //Func return int
    static int Integer_Return_Func()
    {
        System.out.println("I will return Integer");
        return 8;
    }
    static String string_return_func()
    {
        System.out.println("Hi I will Return String");
        return "Aathidya";
    }
    static boolean Boolean_Return_Func()
    {
        System.out.println("I will Return Boolean");

        return true;
    }
    static byte Byte_Return_Func()
    {
        System.out.println("I will Return Byte");
        return 23;
    }

}
