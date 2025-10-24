package ex_16_Functions;

public class Lab_133_Interview_QA {
    //Q: Can we have 2 main method with DIFFERENT SIGNATURE
    //Ans: Yes with diff signature but with same signature not possible

    public static void main(String[] args) {
//JVM recognise only this main method
    }
    public static void main(String args) {

    }

    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }

}
