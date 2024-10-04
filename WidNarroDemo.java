import java.lang.*;
 class WidNarroDemo
 {
    public static void main(String args[])
    {
        byte b=5;
        short s=200;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=100.567;
        char c='A';
        
        //this are some of the demo u can explore more
        b=(byte)s;
        System.out.println(b);
        i=(int)f;
        System.out.println(i);
        d=f;
        System.out.println(d);
    }
 }