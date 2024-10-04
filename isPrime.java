import java.lang.*;
import java.util.Scanner;

class isPrime
{
    static boolean Prime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number To Check Whether it is Prime or Not");
        int num=sc.nextInt();
        if(Prime(num))
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is not a Prime Number");
    }
}
