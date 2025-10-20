package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_126_StringBuffer_Vs_String {
    public static void main(String[] args) {
        StringBuffer sbuff=new StringBuffer("Aathidya");
        sbuff.append("Lakshmi");
        System.out.println(sbuff);
        //Here Sbuff is mutable.The value in sbuff changed to "AathidyaLakshmi" after sbuff.append()


        //STRING(Immutable)
        String str1="Aathidya";
        str1.concat("Lakshmi");
        System.out.println(str1); // Only print "Aathidya"
//StringBuilder-->Mutable
        StringBuilder stringBuilder = new StringBuilder("Aathi");
        stringBuilder.append(123);
        System.out.println(stringBuilder);//Print Aathi123

    }
}
