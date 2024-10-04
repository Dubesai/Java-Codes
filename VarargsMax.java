import java.lang.*;

class VarargsMax
{
    static int max(int ...A)
    {
        if(A.length==0)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            int max=A[0];
            for(int i=1;i<A.length;i++)
            {
                if(max<A[i])
                {
                    max=A[i];
                }
            }
            return max;
        }
    }
    public static void main(String args[])
    {
       System.out.println(max(120,56,587,24));
    }
}