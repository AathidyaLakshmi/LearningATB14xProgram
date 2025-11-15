package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab_152_Overriding_Father_And_Son {
    public static void main(String[] args) {
        // Runtime Polymophism.


       Aathidya p1  = new Aathidya();
        p1.home(); //print 3bhk

       Father f1 = new Father();
        f1.home();//print 2bhk

        Father f2 = new Aathidya(); // Dynamic Dispatch /
        f2.home(); //print 3bhk

        //  Aathidya p2 = new Father();
        // When father is getting born, child reference cannot be given to.

    }
}
class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Aathidya extends Father{
    @Override//having same name function in parent also
    void home(){
        System.out.println("3BHK");
    }
}