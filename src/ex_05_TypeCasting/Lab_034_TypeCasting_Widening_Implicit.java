package ex_05_TypeCasting;

public class Lab_034_TypeCasting_Widening_Implicit {
    public static void main(String[] args) {

        byte b=20;
        int i=b;// here java compiler automatically(Implicitly) do conversion
        // Since it is a conversion from smaller datatype(2 Byte) to larger datatype(4 Byte)

        System.out.println(i);// without any data loss it prints 20

        int j=10;
        double d=j;//implicit conversion
        System.out.println(j);// prints 10
    }
}
