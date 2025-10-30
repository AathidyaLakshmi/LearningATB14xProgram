package For_Loop_Task;

public class Task_04_Sum_Of_First_10_Natural_numbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first 10 natural numbers:"+sum);
        //Approach-2 sum=n*(n+1)/2
    }
}
