package ex_04_Operators;

public class Lab_026_Compound_Assignment_Operators {
    public static void main(String[] args) {
        int age=10;
        System.out.println(age); //prints 10

        age+=20; // implies age=age+20;
        System.out.println(age); //prints 30

        age-=20; //implies age =age-20
        System.out.println(age); //prints 10

        age*=2; // implies age =age*2;
        System.out.println(age);//prints 20

        age/=3; // implies age=age/3; prints quotient
        System.out.println(age); // prints 6

        age %=4; // implies age=age%4; prints remainder
        System.out.println(age);// prints 2


    }
}
