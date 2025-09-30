package ex_06_Ternary_Operator;

public class Lab_038_Nested_Ternary_Operator {
    public static void main(String[] args) {
        //Find largest of 3 numbers
        int a=10,b=20,c=30;
        String largest = a>b ? (a>c? " a is largest":"c is largest"):
                               (b>c? "b is largest":"c is largest");
        System.out.println(largest);// prints c is largest
    }
}
