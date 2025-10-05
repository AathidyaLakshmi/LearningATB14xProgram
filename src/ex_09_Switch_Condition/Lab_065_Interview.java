package ex_09_Switch_Condition;

public class Lab_065_Interview {
    public static void main(String[] args) {
        //Question:what will be the output
        //Ans: 10(since switch expression -1 match with the label -1)
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
