package ex_18_Oops_Constructor;

import org.w3c.dom.ls.LSOutput;

public class Lab_138_OOps_Constructor {
    public static void main(String[] args) {
        A a_obj = new A(); // Object created so default constructor also called
        System.out.println(a_obj);// print all the sout statements
    }

}
class A{
    A()//default constructor
    {
        //USES OF DEFAULT CONSTRUCTOR
        System.out.println("Read CSV file");
        System.out.println("Open page before loading scripts");
        System.out.println("You can do anything which you want to do when object is created");
    }
}
