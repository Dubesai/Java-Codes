import java.lang.*;
import java.util.Scanner;

class multiplicationtable
{
    public static void main(String args[])
    {
        System.out.println("Enter Any Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}