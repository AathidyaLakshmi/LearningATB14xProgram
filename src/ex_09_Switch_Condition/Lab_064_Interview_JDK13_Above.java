package ex_09_Switch_Condition;

public class Lab_064_Interview_JDK13_Above {
    public static void main(String[] args) {
        // in JDK > 13 we can write switch statement without break. it works as same.
        //here we use ->
        int itemCode = 002;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
