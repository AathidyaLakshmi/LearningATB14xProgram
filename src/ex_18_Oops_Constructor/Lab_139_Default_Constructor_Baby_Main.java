package ex_18_Oops_Constructor;

public class Lab_139_Default_Constructor_Baby_Main {
    public static void main(String[] args) {
        Baby b1=new Baby(); //prints "Object created. Default Constructor called for all object creation"
        Baby b2=new Baby();  //prints "Object created. Default Constructor called for all object creation"
    }

}
class Baby{
    //Default Constructor
    Baby()
    {
        System.out.println("Object created. Default Constructor called for all object creation");
    }
}
