package ex_21_Encapsulation;

public class Lab_156_EncapsulationDemo {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setName("Aathidya");
        System.out.println(acc.getName());
        acc.setAmount(35000.56);
        System.out.println(acc.getAmount());
    }
}
class Account
{
    //data and attribute declare as private.It will not be accessible outside of class.
    private String name;
    private  double amount;
    //Only private data's of this class is accesible to this class methods
    //so we can set the value to variable
    // and read the value from methods
    //for each variable we need two methods
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
    void setAmount(double amount)
    {
        this.amount=amount;
    }
    double getAmount()
    {
        return amount;
    }
}
