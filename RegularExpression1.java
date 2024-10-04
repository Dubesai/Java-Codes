import java.lang.*;

class RegularExpression1
{
    public static void main (String args[])
    {
        String str1="*";
        String str2="c";
        String str3="aV4";
        String str4="h";
        String str5="%";
        String str6="Sai Dube1";
        String str7="abcABCS123";


        System.out.println(str1.matches("."));
        System.out.println(str2.matches("[abc]"));
        System.out.println(str3.matches("[a-z][A-Z][0-9]"));
        System.out.println(str4.matches("\\d"));
        System.out.println(str5.matches("\\W"));
        System.out.println(str6.matches(".*"));
        System.out.println(str7.matches("[a-z]*[A-Z]*[0-9]*"));
    }
}