import java.lang.*;
import java.util.Arrays;

class matrixAddition
{
    public static void main(String args[])
    {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
        int C[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                C[i][j]=A[i][j] + B[i][j];
            }
            
        }
        System.out.println("Addition of Matrices Is:");
        
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        } 
    }
}