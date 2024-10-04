import java.lang.*;

class VarargsSum
{
    static int sum(int ...A)
    {
        int sum=A[0];
        for(int i=1;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(sum(5,5));
        System.out.println(sum(1096,847,555));
    }
}