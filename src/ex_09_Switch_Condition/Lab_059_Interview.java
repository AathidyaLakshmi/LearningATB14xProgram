package ex_09_Switch_Condition;

public class Lab_059_Interview {
    public static void main(String[] args) {
        //What is the output
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
        //Output is Match ASCII since ch value A ASCII value is 65 it match with case
    }
}
