package ex_13_Array;

public class Lab_109_Diamond_Pattern {
/*
*           *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
 */

    //Combine both hill and reverse hill
    public static void main(String[] args) {
        int n=5;
        //Hill Pattern code
        for (int i = 1; i<n ; i++) // i<n so that on combining we avoid two identical ows
        {
            //For Decreasing space
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            //for increasing star
            for(int j=1;j<i;j++)
            {
                System.out.print("* ");
            }
            //for increasing star
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        //REVERSE HILL PATTERN
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
