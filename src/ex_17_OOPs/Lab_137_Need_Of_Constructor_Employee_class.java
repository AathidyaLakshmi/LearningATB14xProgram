package ex_17_OOPs;

public class Lab_137_Need_Of_Constructor_Employee_class {
    //Declaring class variables
    int emp_id, dept_number;
    String emp_name;
    double emp_salary;

    //Constructor help us to initialize the class variable
    Lab_137_Need_Of_Constructor_Employee_class(int emp_id, int dept_number, String emp_name, double emp_salary) {
        //here we are assigning value from local variable to class variable
        this.emp_id = emp_id; // this keyword refers class variable
        this.dept_number = dept_number;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    //Creating method to display values
    void display_emp_details() {
        System.out.print("Employee ID:" + emp_id + "\t Department Number " + dept_number + "\t Name:" + emp_name + "\t Salary: " + emp_salary);
    }

}
