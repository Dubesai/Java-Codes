import java.lang.*;
import java.util.Arrays;

class jaggedArray
{
    public static void main(String[] args)
    {
        int A[][];
        A=new int[3][];
        A[0]=new int[2];
        A[1]=new int[4];
        A[2]=new int[3];
        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}