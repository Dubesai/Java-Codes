import java.lang.*;
import java.util.Scanner;

class PalindromeNumber
{
    public static void main(String args[])
    {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=n;
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.println("Reverse Number "+rev);

        if(m==rev)
        {
            System.out.println("Given Number is Palindrome");
        }
        else
        {
            System.out.println("Given Number is Not Palindrome");
        }
    }
}