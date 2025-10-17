package ex_13_Array;

public class Lab_105_Right_Triangle_Pattern {
    public static void main(String[] args) {
        /*
        *
       **
      ***
     ****
    ***** */
        int n=5;
        //Decreasing Spaces
        //Decreasing triangle

        for(int i=1;i<=n;i++)
        {
            //for loop for decreasing spaces
            for(int j=i;j<=n;j++)
            {
                System.out.print("  ");
            }
            //for loop for increasing star
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
