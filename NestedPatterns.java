import java.lang.*;
import java.util.Scanner;

class NestedPatterns
{
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    */

    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print((i+j)+" ");
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                ++count;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j>=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                    
                }
            }
            System.out.println("");
        }
       
    }
    */
    
    /* 
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i+j>=6)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    */
    
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}