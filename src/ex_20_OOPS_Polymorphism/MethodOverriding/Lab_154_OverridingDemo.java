package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab_154_OverridingDemo {
    public static void main(String[] args) {
        Bank b_obj=new Bank();
        System.out.println(b_obj.roi());
        SBI s_obj=new SBI();
        System.out.println(s_obj.roi());
        ICICI ic_obj=new ICICI();
        System.out.println(ic_obj.roi());
    }
}
class Bank{
    double roi()
    {
     return 0;
    }
}
class SBI extends Bank{
    @Override
    double roi(){
        return 3.5;
    }
}
class ICICI extends Bank{
    @Override
    double roi() {
        return 5.6;
    }
}
