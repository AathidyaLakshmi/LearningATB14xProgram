package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_125_Declaration {
    public static void main(String[] args) {
        StringBuilder sbuild=new StringBuilder("Aathidya");
        StringBuffer sbuff=new StringBuffer("Lakshmi");
        System.out.println(sbuild);
        System.out.println(sbuff);
        sbuild.reverse();
        sbuff.reverse();
        System.out.println(sbuild);
        System.out.println(sbuff);
    }
}
