import java.lang.*;
import java.util.Scanner;

class stringMethods1
{
    public static void main(String args[])
    {
        String str="Welcome";
        

        int l=str.length();
        String str1=str.toLowerCase();
        String str2=str.toUpperCase();

        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.next();
        String str3=a.trim();
        
        String str4=str.substring(3);
        String str5=str.substring(3,6);
        String str6=str.replace('e','k');


        System.out.println(l);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }
}