package ex_04_Operators;

public class Lab_031_Interview_Char_INT {
    public static void main(String[] args) {
        char a1='A'; //ASCII value of A is 65
        char a2='B'; //ASCII value of B is 66
        System.out.println(a1+a2);
        /*Question: What will be the output
        * whether it is AB or 6566
        * ANSWER: Since character is an integral type
        *          a1 stores ascii value of 'A' i.e 65
        *          a2 stores ascii value of 'B' i.e 66
        *          a1+a2 prints 131     */
    }
}
