import java.lang.*;
import java.util.Scanner;

class sumofN
{
    public static void main(String args[])
    {
        System.out.println("Enter a number upto which u want sum");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of "+n+" is "+sum);
    }
}
