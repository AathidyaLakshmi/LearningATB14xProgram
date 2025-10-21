package Task;

public class Task_13_Remove_All_Junk_In_String {
    public static void main(String[] args) {
        String str="!@#$%^ABCD&*()<>EFGH~+_ijkl102345";
        System.out.println("Before Removal of Junks: "+str);
        //Using Regular expression
        String rem_str=str.replaceAll("[^a-zA-Z0-9\\s]","");
        System.out.println("After Removal of Junks: "+rem_str);

    }
}
