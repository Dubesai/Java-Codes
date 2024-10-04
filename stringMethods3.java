import java.lang.*;

class stringMethods3
{
    public static void main (String args[])
    {
        String str1="JAVA";
        String str2="java";
        String str3="python";
        String str4="python";
        String str5="Java Program";

        System.out.println("Equals:-");
        System.out.println(str3.equals(str4));
        System.out.println(str1.equals(str2));
        System.out.println("EqualsIgnoreCase:- ");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("Compare to:-");
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str3.compareTo(str4));
        System.out.println(str5.contains("Program"));
    }
}