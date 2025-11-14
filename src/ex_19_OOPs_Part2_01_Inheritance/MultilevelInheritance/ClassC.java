package ex_19_OOPs_Part2_01_Inheritance.MultilevelInheritance;

public class ClassC extends ClassB{
    void methodC()
    {
        System.out.println("I am from Class C method");
    }

    @Override
    void common() {
        System.out.println("ClassC Dynamic Dispatch");
    }
}
