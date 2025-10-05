package ex_09_Switch_Condition;

public class Lab_062_Interview {
    public static void main(String[] args) {
        //Question: Duplicate is allowed
        //No Compiler shows error for duplicate label
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
         //  case 98:
         //      System.out.println("98");
        }
    }
}
