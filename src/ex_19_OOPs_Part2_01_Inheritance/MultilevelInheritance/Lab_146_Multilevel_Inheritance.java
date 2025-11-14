package ex_19_OOPs_Part2_01_Inheritance.MultilevelInheritance;

public class Lab_146_Multilevel_Inheritance {
    public static void main(String[] args) {
        //Create object for ClassC
        ClassC c_obj=new ClassC();
        //With this c obj we can access all members from Class A,B and C
        c_obj.methodA();
        c_obj.methodB();
        c_obj.methodC();

        //Create object for ClassB
        ClassB b_obj=new ClassB();
        //With this b obj we can access mmbers of Class B and Class A not Class C
        b_obj.methodB();
        b_obj.methodA();

        //Create object for classA
        ClassA a_obj=new ClassA();
        //With this a obj we can access members of Class A only
        a_obj.methodA();

        //Dynamic Dispatch java-->Possible only in Multilevel Inheritance
        ClassA a_obj1=new ClassB(); //ClassA reference points to ClassB object
        a_obj1.common();//output: ClassB Dynamic Dispatch
        a_obj1.methodA();//output:I am from ClassA method
//Unable to access ClassB method with a_obj1
        ClassB b_obj1=new ClassC();
        b_obj1.common();//output:ClassC Dynamic Dispatch
        b_obj1.methodA();
        b_obj1.methodB();
        // ClassC c_obj1=new ClassB();
        // ClassB b_obj2=new ClassA();



    }
}
