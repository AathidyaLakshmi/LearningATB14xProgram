package ex_20_OOPS_Polymorphism.MethodOverloading;

public class Lab_148_Calculator {
    public static void main(String[] args) {
  //on compile time based on parameter matching JVM decides which method to be called
        Calc c=new Calc();
        int x=c.add(2,3);//line no #11 invoked
        System.out.println(x);
        double d=c.add(2.3,3.4);//line no #17 invoked
        System.out.println(d);
        String concat=c.add("Aathidya","Lakshmi");//Line no #22 invoked
        System.out.println(concat);
        c.add(2,3,5);// Line number #29 invoked

    }
}
class Calc{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    String add(String a,String b)
    {
        return a+b;
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

}
