import java.lang.*;
import java.util.Scanner;

class largestnumber
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a:- ");
        a=sc.nextInt();
        System.out.println("Enter second number b:- ");
        b=sc.nextInt();
        System.out.println("Enter third number c:- ");
        c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is the Greatest Number");
        }
        else if(b>c)
        {
            System.out.println("B is the Greatest Number");
        }
        else
        {
            System.out.println("C is the Greatest Number");
        }
    }
}