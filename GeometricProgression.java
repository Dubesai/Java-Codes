import java.lang.*;
import java.util.Scanner;

class GeometricProgression
{
    public static void main(String args[])
    {
        System.out.println("This Program Is For Displaying Geometric Progression");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a=sc.nextInt();
        System.out.println("Enter Common Ratio");
        int r=sc.nextInt();
        System.out.println("Enter How Many Numbers To be printed");
        int n=sc.nextInt();

        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+", ");
            term=term*r;
        }
    }
}