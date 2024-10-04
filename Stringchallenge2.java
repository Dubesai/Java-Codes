import java.lang.*;

class Stringchallenge2
{
    public static void main(String args[])
    {
        int i=1001010;
        String str=String.valueOf(i);
        String str2="232AB";
        String str3="29/01/1996";

        System.out.println(str.matches("[01]+"));
        System.out.println(str2.matches("[0-9A-F]+"));
        System.out.println(str3.matches("[0-3][1-9]/[0|1][1-9]/[0-9]{4}"));
        
    }
}