package ex_10_For_Loop;

public class Lab_075_For_Loop_Greater_Vs_Equal {
    public static void main(String[] args) {
        //Question: for loop print i value from which value to which value and how many times it execute
        for (int i = 0; i <= 10; i++) {  // print 0 to 10, execute 11 times
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) { // print 1 to 10, execute 10 times
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) { // print 0 to 9 , execute 10 times
            System.out.println(i);
        }
    }
}
