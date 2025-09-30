package ex_06_Ternary_Operator;

public class Lab_041_Interview_Max_Of_4_Numbers {
    public static void main(String[] args) {
        //Find maximum of 4 numbers without using loop and function
        int n1=10,n2=5,n3=18,n4=20;

        int max=(n1>n2)?n1:n2;
        max=(max>n3)?max:n3;
        max=(max>n4)?max:n4;
        System.out.println("Largest of all 4 number is:"+max);
    }
}
