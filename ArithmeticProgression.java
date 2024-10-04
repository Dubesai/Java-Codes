import java.lang.*;
import java.util.Scanner;

class ArithmeticProgression
{
    public static void main(String args[])
    {
        System.out.println("Program to print Arithmetic Progression");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Digit");
        int a=sc.nextInt();
        System.out.println("Enter Common Difference");
        int d=sc.nextInt();
        System.out.println("Enter How Many Numbers To be printed");
        int n=sc.nextInt();

        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+ ", ");
            term=term+d;
            
        }
        
    }
}