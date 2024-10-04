import java.lang.*;
import java.util.Scanner;

class overloadedArea
{
    static double area(double l,double b)
    {
        return l*b;
    }
    static double area(double r)
    {
        return Math.PI*r*r;
    }
    static double area(double a,double b,double h)
    {
        return 0.5*(a+b)*h;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("=========");
        System.out.println("1]Area Of Rectangle");
        System.out.println("2]Area Of Circle");
        System.out.println("3]Area Of Trapezoid");
        System.out.println("4]Exit");
        System.out.println("Enter Option Number");
        int option=sc.nextInt();

        switch(option)
        {
            case 1: System.out.println("Enter Length Of Rectangle");
                    double a=sc.nextDouble();
                    System.out.println("Enter Breadth Of Rectangle");
                    double b=sc.nextDouble();
                    System.out.println("Area of Rectangle "+area(a,b));
                    break;
            case 2: System.out.println("Enter Radius Of Circle");
                    double radius=sc.nextDouble();
                    System.out.println("Area of Circle "+area(radius));
                    break;
            case 3: System.out.println("Enter First Side");
                    double x=sc.nextDouble();
                    System.out.println("Enter Second Side");
                    double y=sc.nextDouble();
                    System.out.println("Enter Height Of Trapezoid"); 
                    double c=sc.nextDouble();
                    System.out.println("Area of Trapezoid "+area(x,y,c));
                    break;
            default:System.out.println("Exiting...");
                    break;

        }
    }
}