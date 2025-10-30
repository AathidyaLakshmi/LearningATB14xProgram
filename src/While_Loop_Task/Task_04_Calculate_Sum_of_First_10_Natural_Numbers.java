package While_Loop_Task;

public class Task_04_Calculate_Sum_of_First_10_Natural_Numbers {
    public static void main(String[] args) {
       /* Approch-1 Without using any loop
       int n=10,sum=0;
        sum=n*(n+1)/2;
        System.out.println(sum);*/
        int i=1,sum=0;

        while(i<=10)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers: "+sum);
    }
}
