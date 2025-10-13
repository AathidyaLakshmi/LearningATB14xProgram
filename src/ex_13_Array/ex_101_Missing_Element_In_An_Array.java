package ex_13_Array;

public class ex_101_Missing_Element_In_An_Array {
    public static void main(String[] args) {

        // step-1 sum of n numbers=n*(n+1)/2-->expected sum-->[1,2,3,4,....n]
        //sum of numbers in given array -->actual sum
        //missing number=Expected sum - Actual sum

        int[] a = {1,2,4,5}; // find the missing element in array a
        int expected_sum = 0, actual_sum = 0;
        //int arr_size=a.length;
        int n=a.length+1; //in problem statement itself told that 1 number is missing/
        // so size of array is n-1.so to get expected sum add by 1
        expected_sum= n*(n+1)/2;
        // To get actual sum
        for(int i=0;i<a.length;i++)
        {
            actual_sum = actual_sum+a[i];
        }
        int miss_element= expected_sum-actual_sum;
        System.out.println("Missing element in given array: "+miss_element);
        //1+2+3+4+5 =15 -->Expected sum
        //1+2+4+5=12-->Actual sum
        //missing element = 15-12=3
    }
}
