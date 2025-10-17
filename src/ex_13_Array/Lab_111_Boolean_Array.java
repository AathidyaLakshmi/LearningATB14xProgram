package ex_13_Array;

public class Lab_111_Boolean_Array {
    public static void main(String[] args) {
        boolean[] vote_status=new boolean[2];
        vote_status[0] = true;
        vote_status[1] = false;
        //vote_status[2]= true;// ArrayIndexOutofBoundException throws

        for(boolean status: vote_status)
        {
            System.out.println(status);
        }
    }
}
