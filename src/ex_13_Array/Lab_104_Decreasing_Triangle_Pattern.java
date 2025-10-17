package ex_13_Array;

public class Lab_104_Decreasing_Triangle_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i= 1; i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println(); // pointer moves to next row
        }
    }
}
