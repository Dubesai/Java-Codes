import java.lang.*;
import java.util.*;

class keyboard
{
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Two Numbers");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum of Two Numbers is " +c);
    }
}