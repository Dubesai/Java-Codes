import java.lang.*;
import java.util.Scanner;

class OneDiemensionalArray
{
    public static void main(String args[])
    {
        int A[]=new int[5];
        int B[]={1,2,3,4,5};
        int C[];
        C=new int[5];

        A[3]=15;
        B[2]=8;

        for(int x:A)
        {
            System.out.println(x);
        }
        System.out.println("");
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        System.out.println("");
        for(int i=B.length-1;i>=0;i--)
        {
            System.out.println(B[i]);
        }
        System.out.println("");
        for(int x:C)
        {
            System.out.println(x);
        }
        
    }
}