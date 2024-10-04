import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class deletionarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of an Array");
        int n=sc.nextInt();
        
        System.out.println("Enter Elements of array");
        int A[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter Element You Want To Delete");
        int elem=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(A[i]==elem)
            {
                for(int j=i;j<A.length-1;j++)
                {
                    A[j]=A[j+1];
                }
                break;
            }
        }

        System.out.println("Array After Deletion");
        {
            for(int i=0;i<A.length-1;i++)
            {
                System.out.print(A[i]+",");
            }
        }
    }
}