package ex_20_OOPS_Polymorphism.MethodOverriding;

public class Lab_153_Automation_Overriding {
    public static void main(String[] args) {
 //To call method in CommonToAll
        CommonToAll cta_obj=new CommonToAll();
        cta_obj.Open_Browser(); //prints Starting IE Browser
   //To call method in ChromeTC class
   ChromeTC ctc_obj=new ChromeTC();
   ctc_obj.Open_Browser(); //prints Starting Chrome

        FirefoxTC ftc_obj=new FirefoxTC();
        ftc_obj.Open_Browser(); //prints Starting Firefox

        //Dynamic Dispatch or method overriding
        //Create object for child with parent reference variable and access only the overridden method in child
        CommonToAll cta_dyn_obj= new FirefoxTC();
        cta_dyn_obj.Open_Browser(); //Print Starting Firefox

    }
}
class CommonToAll
{
    void Open_Browser(){
    System.out.println("Starting IE Browser");
}
}
class ChromeTC extends CommonToAll{
    @Override
    void Open_Browser(){
        System.out.println("Starting Chrome");
    }
}
class FirefoxTC extends CommonToAll{
    @Override
    void Open_Browser()
    {
        System.out.println("Starting Firefox");
    }
}
