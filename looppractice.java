import java.lang.*;
import java.util.Scanner;

class looppractice
{
    /* 
    public static void main(String args[])
    {
        int i=1,n=100;
        while(i<n)
        {
            System.out.println(i);
            i=i*2;
        }
    }
    */
    public static void main(String args[])
    {
        int i=1,n=100;
        do
        {
            System.out.println(i);
            i=i*2;
        }
        while(i<n);
    }
}