package ex_20_OOPS_Polymorphism.Diff_bw_Overload_Override;

public class Lab_155_Overloading_Vs_Overriding {
    public static void main(String[] args) {
        ABC a_obj=new ABC();
        a_obj.m1(3);
        a_obj.m2(6);

        XYZ x_obj=new XYZ();
        x_obj.m1(2);
        x_obj.m2(5,6);
        x_obj.m2(5);
    }
}
class ABC
{
    void m1(int a)
    {
        System.out.println(a);
        System.out.println("I am a method m1 from class ABC");
    }
    void m2(int b){
        System.out.println(b);
        System.out.println("I am method m2 from class ABC");
    }
}
class XYZ extends ABC{
    void m1(int a)//Overriding
    {
        System.out.println(a*a);
        System.out.println("I am Overrided method m1 from class XYZ");
    }
    void m2(int a,int b)//Overloading
    {
        System.out.println(a*b);
        System.out.println("I am Overloaded method m2 from class XYZ");;
    }
}