package ex_10_For_Loop;

public class Lab_068_For_Loop_Pre_Inrement {
    public static void main(String[] args) {
        //does it matter if we use pre increment instead of post increment

        for(int j=0;j<10;++j)
        {
            System.out.println(j);
        }
        // print 0 to 9
        //so pre increment and post increment doesn't matter,
        // since increment is done after the execution of loop
    }
}
