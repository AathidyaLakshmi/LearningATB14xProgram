package Task;

public class Task_02_Ternary_Operator_Interview {
    public static void main(String[] args) {
        //Check if the number is even or odd by using Ternary Operator.
        int a=25;
        String result=(a%2==0)?"Number is even":"Number is odd";
        System.out.println(result);

        //Interview - Zeta → (AT) Ter nested → Max between 3 numbers →  int n1 = 2; int n2 = 9;  int n3 = -11;
        int n1=2,n2=9,n3=-11;
        String largest=(n1>n2)?(n1>n3?"n1 is largest":"n3 is largest"):(n2>n3?"n2 is largest":"n3 is largest");
        System.out.println(largest);

        //Real_Age_Classification (  age → 59 ) →  Minor, Adult (Adult , Sr Senior) - Ternary Operator
        int age=59;
        String category=(age>18)?(age>=58?"Senior":"Adult"):"Minor";
        System.out.println(category);
    }
}
