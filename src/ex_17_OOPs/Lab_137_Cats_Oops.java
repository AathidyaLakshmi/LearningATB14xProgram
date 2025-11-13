package ex_17_OOPs;

public class Lab_137_Cats_Oops {
    public static void main(String[] args) {
        cat c1;
        cat c2;
       /* Q:How many objects are there for cat as of now? Ans: No objects.Only reference variable created*/
        cat c3=new cat();
        new cat();
        /*Q: Now how many objects are there? Ans: 2*/
        System.out.println(c3.name); /*Q: what will be the output if no values is assigned? Ans: Default value "null" get printed*/
        //Now give initial value for name using default costructor
        cat c4=new cat();
        cat c5=new cat();
        System.out.println(c4.name);
        System.out.println(c5.name);
        /*What will be printed if name assigned to kitty using default constructor
        * Ans: Kitty will be printed 3 times because this variable common to all objects. because it is assigned in default constructor*/

 // Calling parameterised constructor
cat c6=new cat("Lucy");
        System.out.println(c6.name);
    }
}
class cat{
    String name;//Class variable or instance variable
    cat()
    {
        // This variable value is common to all the objects
        this.name="kitty";
    }
    // Q: Does all cat name is kitty? No each cat name is different .
    //Ans: for this we need parameterised constructor
    cat(String name)
    {
        this.name=name;
    }
    void running(){
        int i=10;//Local variable

    }
}
