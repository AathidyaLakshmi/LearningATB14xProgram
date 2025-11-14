package ex_19_OOPs_Part2_01_Inheritance.HierachicalInheritance;

public class Lab_147_HierarchicalInheritance {
    public static void main(String[] args) {
        //Create object of Child1
        Child1 c1_obj=new Child1();
        //with this Child 1 object we can access members of Child1 and Parent
        c1_obj.child1_method();
        c1_obj.Parent_method();


        //Create object of Child2
        Child2 c2_obj=new Child2();
        //with this Child 2 object we can access members of Child2 and Parent
        c2_obj.child2_method();
        c2_obj.Parent_method();


        //Create object for Parent
        Parent p_obj=new Parent();
        //with this Parent object we can access members only Parent
        p_obj.Parent_method();

    }
}
