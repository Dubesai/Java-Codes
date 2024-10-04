import java.lang.*;

class sortingArray
{
    public static void main(String args[])
    {
        String A[]={"java","pascal","ada","basic","smalltalk","python"};

        java.util.Arrays.sort(A);

        for(String x:A)
        {
            System.out.print(x+" ");
        }
    }
    
}