import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class increaseSizeOfArray
{
    public static void main(String[] args)
    {
        int A[]={8,6,10,9,2};
        System.out.println("Length of Array A is "+A.length);
        int B[]=new int[2*A.length];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
        
        System.out.println("Length of Array A is "+A.length);
        System.out.println("Length of Array B is "+B.length);
    }
}