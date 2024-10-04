import java.lang.*;
import java.util.Scanner;

class digitsOfNumber
{
    /* 
    public static void main(String args[])
    {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0)
        {
            int r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
    */

    public static void main(String args[])
    {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Total Number of Digits in Number is "+count);
    }
}