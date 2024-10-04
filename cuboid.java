import java.lang.*;
import java.util.Scanner;

class cuboid
{
    public static void main(String args[])
    {
        int height,breadth,length;
        int totalArea,volume;
        System.out.println("Enter height,breadth,length of the Cuboid");
        Scanner sc=new Scanner(System.in);
        height=sc.nextInt();
        breadth=sc.nextInt();
        length=sc.nextInt();
        totalArea=2*(length*breadth+breadth*height+length*breadth);
        volume=length*breadth*height;
        System.out.println("Total area oF Cuboid is :- "+totalArea);
        System.out.println("Volume of Cuboid is :- "+volume);
    }
}