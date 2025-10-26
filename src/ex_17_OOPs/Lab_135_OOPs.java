package ex_17_OOPs;

public class Lab_135_OOPs {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Aathidya";
        p1.age=35;
        //Person-->class
        //p1-->Object Reference Variable
        //new Person()-->Object created in heap memory
        Person p2=new Person();
        p1.name="Ilandevi";
        p1.age=13;
        //We can create n number of objects for a single class
        new Person();

        /*Note: We have created 3 objects and 2 reference variable for a class person*/
    }
}
