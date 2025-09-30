package ex_06_Ternary_Operator;

public class Lab_037_Ternary_Operator {
    public static void main(String[] args) {
        int age =18;
        String decision = age>18?"Eligible to Vote":"Not Eligible to vote";
        System.out.println(decision);// since the age is just 18 person is not eligible to vote

        age++;
        String decision1 = age>18?"Eligible to Vote":"Not Eligible to vote";
        System.out.println(decision1);// now the age is 19 so person is eligible to vote


    }
}
