import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class overloadedReverse
{
    static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    static int [] reverse(int A[])
    {
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }
        return B;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter Any Number");
        int num=sc.nextInt();
        int ans=reverse(num);
        System.out.println(ans);
        
        System.out.println("Enter Length of Array");
        int length=sc.nextInt();
        System.out.println("Enter Elements in Array");
        int A[]=new int[length];
        for(int i=0;i<length;i++)
        {
            A[i]=sc.nextInt();
        }
        int B[]=reverse(A);
        System.out.println("Reversed Array Is "+Arrays.toString(B));

    }
}