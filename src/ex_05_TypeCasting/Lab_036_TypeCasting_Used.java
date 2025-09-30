package ex_05_TypeCasting;

public class Lab_036_TypeCasting_Used {
    public static void main(String[] args) {
        int course_fee=100;
        float gst=18.75F;
       // int total_fees= course_fee+gst;

        // need to do Explicit conversion.. possible of data loss
        // java compiler shows error as "java: incompatible types: possible lossy conversion from float to int"

        int total_fees= course_fee+(int)gst; // Explicitly converted
        System.out.println(total_fees); // prints 118 and .75 doesn't taken

        //INSTEAD WE CAN TAKE BIGGER CONTAINER TO PREVENT DATA LOSS
        float total=course_fee+gst;
        System.out.println(total); // prints 118.75

    }
}
