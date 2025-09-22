package ex_02_Java_Basics;

public class Lab011_Primitive_Type {
    public static void main(String[] args) {

        //INTEGRAL DATATYPE
        byte b=10;//jvm allocate 1 byte in memory
        short s=20;//jvm allocate 2 byte in memory
        int i=100;//jvm allocate 4 byte in memory

        long phone_1= 7788669944l; //jvm allocate 8 byte in memory
        long phone_2=9988776655L;//jvm allocate 8 byte in memory
        /*
        * why we are specify literal l or L while declaring long type?
        * because by default java compiler implicitly consider long value as int
        * we are explicitly telling to the compiler that this value is long by specifying literal l or L
        * */
        char c='A'; //jvm allocate 2 byte in memory

        // FLOATING DATATYPE
        float pi=3.14f; // jvm allocate 4 byte in memory
        float pi_1=3.16F; //jvm allocate 8 byte in memory
        /*
         * why we are specify literal f or F while declaring float type?
         * because by default java compiler implicitly consider float value as double
         * we are explicitly telling to the compiler that this value is float type by specifying literal f or F
         * */
    }
}
