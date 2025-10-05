package ex_10_For_Loop;

public class Lab_074_For_Loop_Interview {
    public static void main(String[] args) {
        //Question: what is the output
        for (int i = -1; i > -10 ; i--) {
            System.out.println(i);
        }
// Ans: print from -1 to -9
        // can we have initialization outside: yes we can
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
        // Ans: print from 10 to 1
    }
}
