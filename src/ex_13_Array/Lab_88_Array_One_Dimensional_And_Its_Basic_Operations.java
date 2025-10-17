package ex_13_Array;

public class Lab_88_Array_One_Dimensional_And_Its_Basic_Operations {
    public static void main(String[] args) {
        //Declaration of arrays
        // Approach-1
        int[] a = new int[3];

        /*or  we can declare like
        int a[]=new int[5];
        int []a=new int[5];
        */
        //Adding values to above array
        //Approach-1
        a[0]=100;
        a[1]=200;
        a[2]=300;
        //if we try to add a[3]= any value then we get error "Array index is out of bounds"
       // Approach-2 Declaraion and adding values in one line
        int[] b={20,40,50,60};

        //Read elements from array
        //Approach-1 Read single value from an array

        System.out.println(a[2]);// prints 300

        //Find array size or length of an array

        int arr_size1=a.length; // stores array length as 3
        int arr_size2=b.length;//stores array length as 4

        //Approach 2 either by using for loop or enhanced for loop
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

//Approach 2.1 Using enhanced for loop
        for(int value:b)
        {
            System.out.println(value);
        }
    }
}
