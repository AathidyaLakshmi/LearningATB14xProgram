package ex_09_Switch_Condition;

public class Lab_066_Interview {
    public static void main(String[] args) {
        //Question: What will be the output
        //Answer: Helloooo
        //      : 65   prints since default doesn't have break
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
