import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class copyingarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of an Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements of an Array");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }

        int B[]=new int[n];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }

        System.out.println("Array A is");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("");

        System.out.println("Array B is");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(B[i]+",");
        }
    }
}