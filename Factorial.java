import java.lang.*;
import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of Number "+n+"! is "+fact);
    }
}