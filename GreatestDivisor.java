import java.lang.*;
import java.util.Scanner;

class GreatestDivisor
{
    static int GCD(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println(GCD(a,b)+" is GCD of Two Nubers");
        
    }
}