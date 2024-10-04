import java.lang.*;

public class Bitwise
{
    public static void main(String args[])
    {
        /*        
        int x=0b1010;
        int y=0b0110;
        int z=x&y;
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        */

        
        int x=0b1010;
        int y=0b0110;
        int z=x|y;
        int a=x^y;
        int b=x>>1;
        int c=x<<2;
        int d=x>>1;
        System.out.println(z);
        System.out.println(String.format("%s",Integer.toBinaryString(z)));
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%s",Integer.toBinaryString(b)));
        System.out.println(c);
        System.out.println(String.format("%s",Integer.toBinaryString(d)));
         

        
    }
}