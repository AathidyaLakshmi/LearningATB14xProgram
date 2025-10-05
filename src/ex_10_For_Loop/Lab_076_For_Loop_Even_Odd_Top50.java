package ex_10_For_Loop;

public class Lab_076_For_Loop_Even_Odd_Top50 {
    public static void main(String[] args) {
        //To find even and odd numbers from 1 to 50
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i+ " is even");
            }
            else{
                System.out.println(i+ " is odd");
            }
        }
    }
}
