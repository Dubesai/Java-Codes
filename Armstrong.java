import java.lang.*;
import java.util.Scanner;

class Armstrong
{
    public static void main(String args[])
    {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        System.out.println("Sum "+sum);

        if(m==sum)
        {
            System.out.println(m+" is a Armstrong Number");
        }
        else
        {
            System.out.println(m+" is not a Armstrong Number");
        }
    }
}