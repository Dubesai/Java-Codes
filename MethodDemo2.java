
import java.lang.*;

class MethodDemo2
{
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }
    public static void main(String args[])
    {
        int a=20;
        inc(a);
        System.out.println(a);
    }
}