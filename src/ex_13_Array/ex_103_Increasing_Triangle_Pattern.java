package ex_13_Array;

public class ex_103_Increasing_Triangle_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)// Iterate through rows
        {
            for(int j = 1;j<=i;j++) //Iterate through columns
            {
                System.out.print("* ");

            }
            System.out.println();// pointer moves to next row
        }
    }
}
