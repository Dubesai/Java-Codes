import java.lang.*;
import java.util.Scanner;

class LeapYear
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter Any Year");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("This year is a Leap Year");
                }
                else
                {
                    System.out.println("This year is not a Leap Year");
                }
            }
            else
            {
                System.out.println("This is a Leap Year");
            }
        }
        else
        {
            System.out.println("This is not a Leap Year");
        }
    }
}