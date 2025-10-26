package ex_17_OOPs;

public class Lab_140_Constructor {
    //This class is accessible anywhere within the project
    public static void main(String[] args) {
//Create Object for Student class
  Student std1=new Student();
        //On creation of new object for a class JVM call default constructor,
        // even we do not create constructor for it,
        // JVM create one default constructor and calls it.
        std1.name="Aathidya";
        //Run the program now. In output | Hi I am default constructor| gets printed.
        //Note:we are not calling constructor here. But JVM automatically calls default constructor
        //PARAMETERISED CONSTRUCTOR CALLING
        Student std_param=new Student("Aathidya");//Passing value to parameterised constructor
        System.out.println("main class name:"+std1.name);
        //Run the program
    }
}
//public class Student{
    //There should be one public class in a file
//}
class Student{
    //This class is accessible within the class Lab_140_Constructor.
    //Not outside of this

    //DEFAULT CONSTRUCTOR
    Student(){
        System.out.println("Hi I am default constructor");
    }
   //PARAMETERISED CONSTRUCTOR

    String name;
    void sleep(){}
    void study(){}
    void eat(){}


    //PARAMETERISED CONSTRUCTOR
    //This will be called when we create parameterised constructor
    Student(String name)
    {
        System.out.println("Hi "+name);
    }
}