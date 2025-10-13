package ex_13_Array;


public class ex_89_Array_Two_Dimensional_And_Its_Basic_Operations {
    public static void main(String[] args) {

        //APPROACH - 1
        //Declaration of 2D array - when size is static
        int[][] a = new int[3][2];
        /* or we can declare like
         * int [][]a =new int [3][3]
         * int []a[] =new int [3][3];*/

        // Add values into static array
        //Add values in 1st row
        a[0][0] = 100;
        a[0][1] = 200;
// Adding values in 2nd row
        a[1][0] = 300;
        a[1][1] = 400;
//Adding values in 3rd row
        a[2][0] = 500;
        a[2][1] = 600;

// To find size of an array
        int row_size = a.length;
        int column_size = a[0].length; // Number of column in particular row
        System.out.println("Number of rows in array a:" + row_size);
        System.out.println("Number of column in first row:" + column_size);

        // To read and print values in an array
        // Using For loop
        for (int r = 0; r < row_size; r++) // Navigate through rows
        {
            for (int c = 0; c < column_size; c++) {
                System.out.print(a[r][c]+" ");

            }
            System.out.println();

        }
    }
}
