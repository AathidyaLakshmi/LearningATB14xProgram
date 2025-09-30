package ex_05_TypeCasting;

public class Lab_035_TypeCasting_Narrowing_Explicit {
    public static void main(String[] args) {
        int i=300;
       // byte b=i;
        /*Compiler shows error in above case says "java: incompatible types: possible lossy conversion from int to byte"
        * Since we are trying to store the value of bigger data type(4) in smaller data type(1)
        * To do this explicitly i.e., we are telling the compiler convert this manually with the help of syntax
        * In this case we may cause some data loss*/

        byte b=(byte)i;
        System.out.println(b); // prints 44
//300 binary bit is 32 bit.last 8 bit taken into account and stored in byte it is 44

        double d=2345.6785;
        int j=(int)d;
        System.out.println(j);//prints 2345
    }
}
