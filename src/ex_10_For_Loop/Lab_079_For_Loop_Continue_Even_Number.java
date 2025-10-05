package ex_10_For_Loop;

public class Lab_079_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                continue; // here if the condition true and the number is odd
                // then, it skip th below statement and go to for loop and increment the value by 1
            }
            System.out.println("Even =" + i);
        }
    }
}
