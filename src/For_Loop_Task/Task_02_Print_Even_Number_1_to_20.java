package For_Loop_Task;

public class Task_02_Print_Even_Number_1_to_20 {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20");
        for(int i=1;i<=20;i++)
        {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
