import java.lang.*;
import java.util.Scanner;

class maxArray
{
    static int max(int A[])
    {
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            if(max<A[i])
                max=A[i];
        }
        return max;
    } 

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements of Array");
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println(max(A)+" is Maximum Number");
    }
}