import java.lang.*;
import java.util.*;

class triangle{
    public static void main(String args[])
    {
        float base,height,area;

        System.out.println("Enter Base and Height of Triangle");
        Scanner s=new Scanner(System.in);
        base=s.nextFloat();
        height=s.nextFloat();
        area=base*height/2;
        System.out.println("Area of triangle is:"+area);
    }
}