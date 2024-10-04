import java.lang.*;
import java.util.Arrays;

class twoDimensionalArray
{   
     
    public static void main(String args[])
    {
        int A[][]=new int[3][4];
        int B[][]={{2,3,6,9},{4,2,5,9},{5,6,7,1}};
        int C[][];
        C=new int[3][4];
        /* 
        for(int i=0;i<B.length;i++)
        {
            for(int j=0;j<B[0].length;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        */

        for(int x[]:B)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }


}