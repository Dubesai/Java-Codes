import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class reversecopying
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of an Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements of Array");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int B[]=new int[n];

        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j]=A[i];
        }

        System.out.println("Array A is");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.println("");

        System.out.println("Array B is");
        for(int j=0;j<B.length;j++)
        {
            System.out.print(B[j]+",");
        }
    }
}