package ex_19_OOPs_Part2_01_Inheritance.MultilevelInheritance;

public class ClassB extends ClassA{
    void methodB()
    {
        System.out.println("I am from ClassB Method");
    }

    @Override
    void common() {
        System.out.println("ClassB Dynamic Dispatch");
    }
}
