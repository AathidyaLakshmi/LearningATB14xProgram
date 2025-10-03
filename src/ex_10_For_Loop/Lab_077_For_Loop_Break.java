package ex_10_For_Loop;

public class Lab_076_For_Loop_Break {
    public static void main(String[] args) {
        for (int i=0;i<50;i++){
            System.out.println(i);
            if(i==5)
                break;
            // print 0 to 5 loop execute 6 times once i value become 5 execution comes out of the for loop
        }
        for (int j=0;j<50;j++)
        {
            if(j==5)
                break;
            System.out.println(j);
            // print 0 t0 4 loop execute 5 times
        }
    }
}
