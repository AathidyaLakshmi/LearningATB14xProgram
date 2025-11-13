package ex_18_Oops_Constructor;

public class Lab_140_Car_Main {
    //Linked with class car and login page
    public static void main(String[] args) {
        Login_Page lp1_obj=new Login_Page();//It will call default constructor
        System.out.println(lp1_obj.name);//Print default vale of name "null" since we are not assign any default values

        Car tesla=new Car();//call default constructor of car
        System.out.println(tesla.name);//print unknown
        System.out.println(tesla.model);//print XXXX
        System.out.println(tesla.year);//print 0

//Call Parameterized Constructor
        Car c1=new Car("Innova","Innova A",2020);

        Car c2=new Car("Santro X");

    }
}
