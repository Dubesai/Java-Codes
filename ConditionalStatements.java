import java.lang.*;
import java.util.Scanner;

class ConditionalStatements
{
    public static void main(String args[])
    {
        //Program to find given number is positive or negative
        
        System.out.println("Enter Any Number");
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();

        if(x>=0)
        {
            System.out.println("The Number is Positive");
        }
        else
        {
            System.out.println("The Number is Negative");
        }
    }
}