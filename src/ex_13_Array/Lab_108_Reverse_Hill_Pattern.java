package ex_13_Array;

public class Lab_108_Reverse_Hill_Pattern {
    /*
     * * * * * * * * *
       * * * * * * *
         * * * * *
           * * *
             *

     * 1. Increasing space
    * 2. Decreasing star
    * 3. Decreasing star
    * */
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++) // For iterate through rows
        {
            //for increasing space
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            //for Decreasing star
            for (int j = i; j < n; j++) { //j<n peak should not be * *
                System.out.print("* ");
            }
            //for Decreasing star
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
