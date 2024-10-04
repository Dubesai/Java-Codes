import java.lang.*;

class rotatingArray
{
    /* 
    //left rotation
    public static void main(String args[])
    {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
        int temp=A[0];
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        for(int x:A)
        {
            System.out.print(x+",");
        }
    }
    */

    public static void main(String args[])
    {
        int A[]={5,9,6,10,12,7,3,5,4,2};
        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
        
        int temp=A[A.length-1];
        for(int i=A.length-1;i>0;i--)
        {
            A[i]=A[i-1];
        }
        A[0]=temp;

        for(int x:A)
        {
            System.out.print(x+",");
        }
        System.out.println("");
    }
}