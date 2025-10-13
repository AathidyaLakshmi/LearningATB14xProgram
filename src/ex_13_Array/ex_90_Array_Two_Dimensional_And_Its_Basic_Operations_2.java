package ex_13_Array;

public class ex_90_Array_Two_Dimensional_And_Its_Basic_Operations_2 {
    public static void main(String[] args) {
        //APPROACH - 1
        //Declaration and Adding values in 2D array - when size is dynamic

        int[][] a= {{100, 200},
                    {300, 400},
                    {500, 600}
                    };
// To find size of an array
        int row_size = a.length;
        int column_size = a[0].length; // Number of column in particular row
        System.out.println("Number of rows in array a:" + row_size);
        System.out.println("Number of column in first row:" + column_size);

        // To read and print values in an array
        // Using For Each loop
        for(int arr[]:a) // a represent entire first row. capture ist row values and put in array arr[]
        {
            for(int value:arr)
            {
                System.out.print(value +"  ");
            }
            System.out.println();
        }
    }
}
