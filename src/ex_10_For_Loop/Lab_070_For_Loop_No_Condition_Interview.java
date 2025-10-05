package ex_10_For_Loop;

public class Lab_070_For_Loop_No_Condition_Interview {
    public static void main(String[] args) {
        //Question: what will be the output if for loop doesn't have condition
         // what is the exit code
        for (int i = 0; ; i++){
            System.out.println(i);
        }
        // Ans: If there is no condition then loop execute infinite times
        //expected ans: "Process finished with exit code 130"
        //              which means we stop execution manually by clicking stop(red) button
        // Process finished with exit code 0 --> means successful
    }
}
