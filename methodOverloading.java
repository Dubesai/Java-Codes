import java.lang.*;

class methodOverloading
{
     
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    
    static float max(float x,float y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    
    static int max(int x,int y,int z)
    {
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        else
            return z;
    }

    public static void main(String args[])
    {
        int a=10,b=20,c=30;
        float d=10.5f,e=7.5f;
        System.out.println(max(a,b));
        System.out.println(max(d,e));
        System.out.println(max(a,b,c));
    }
}