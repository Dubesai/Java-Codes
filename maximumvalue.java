import java.lang.*;

class maximumvalue
{
    /* 
    public static void main(String args[])
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(max<A[i])
            {
                max=A[i];
            }
        }
        System.out.println("Maximum Value is:- "+max);
    }
    */

    public static void main(String args[])
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1=A[0],max2=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Maximum Value "+max1);
        System.out.println("Second Largest Value "+max2);
    }
}