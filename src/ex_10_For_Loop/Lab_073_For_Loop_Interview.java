package ex_10_For_Loop;

public class Lab_073_For_Loop_Interview {
    public static void main(String[] args) {
        //Question: can we have long and float variable for initialization in for loop
        // Answer: It is absolutely valid. but in practical scenario there is no use
        //possible but never we use this
        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
    }

}
