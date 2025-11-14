package ex_19_OOPs_Part2_01_Inheritance.SingleInhertance;

public class Lab_142_Single_Inheritance {
    public static void main(String[] args) {
        //Creating object for son class..
        Son s=new Son();
        //With this son object we get all members from class father and class son
        System.out.println(s.gold_kg); //Attribute from father class
        s.house_2bhk(); //From father class
        s.house_3bhk(); //From son class
    }
}
