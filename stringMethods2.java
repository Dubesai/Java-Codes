import java.lang.*;

class stringMethods2
{
    public static void main(String args[])
    {
        String str="www.abcd.org";

        boolean str1=str.startsWith("www.");
        boolean str2=str.endsWith(".org");
        char str3=str.charAt(5);
        int str4=str.indexOf("c");
        int str5=str.indexOf("bcd");
        int str6=str.indexOf(".",4);
        int str7=str.lastIndexOf(".");
        int str8=str.lastIndexOf(".",7);
        int str9=str.lastIndexOf("?");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str9);
    }
}