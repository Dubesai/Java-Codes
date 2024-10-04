import java.lang.*;
import java.util.Scanner;

class Stringchallenge
{
    public static void main(String args[])
    {   
        System.out.println("Enter Your Email Id");
        Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();


        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain=str.substring((i+1),str.length());

        System.out.println("Username:- "+uname);
        System.out.println("Domain:- "+domain);
        
        
        //System.out.println(domain.startsWith("gmail"));
        

        int j=domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));



    }
}