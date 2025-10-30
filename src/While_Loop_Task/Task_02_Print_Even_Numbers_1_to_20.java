package While_Loop_Task;

public class Task_02_Print_Even_Numbers_1_to_20 {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Even Numbers from 1 to 20");
        while(i<=20)
        {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;

        }
    }
}
