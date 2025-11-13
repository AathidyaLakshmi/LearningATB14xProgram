package ex_18_Oops_Constructor;

public class Car {
    //Declaring Variable
    String name,model;
    int year;
    //Default constructor to initialize default value to the variable
    Car(){
        name="Unknown car";
        model="XXXX";
        year=0;
        System.out.println("Default constructor called");
    }
    //Parameterised Constructor with overloading
    Car(String name,String model,int year)
    {
        System.out.println("Parameterized constructor1 called");
        //Assign values to variables
        //Assign Local variables to class variable
        this.name=name;
        this.model=model;
        this.year=year;
    }
    Car(String model)
    {
        this.model=model;

        System.out.println("Parameterised constructor 2 called");

    }
    Car(String name,String model)
    {
        //Calling Constructor inside Another constructor:CONSTRUCTOR CHAINING
        this("i10");//Calling line number 24 Another Constructor
        this.name=name;
        this.model=model;
        System.out.println("Parameterised Constructor 3 called");
    }
}
