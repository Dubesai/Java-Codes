import java.lang.*;
import java.util.Scanner;

class areaoftriangle
{
    public static void main(String args[])
    {
        int a,b,c;
        double s,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Sides oF Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2f;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle :- "+area);
    }
}