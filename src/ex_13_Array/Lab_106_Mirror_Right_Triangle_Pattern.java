package ex_13_Array;

public class Lab_106_Mirror_Right_Triangle_Pattern {
    public static void main(String[] args) {
        /*
        * ******
        *  *****
        *    ***
        *     **
        *      *
        * */

        //Increasing spaces
        //Decreasing star
        int n=5;
        for(int i=1;i<=n;i++)// iterate through rows
        {
            //for loop for increasing spaces
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            //for loop for decreasing star
            for(int j=i;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();//Iterate through rows
        }
    }
}
