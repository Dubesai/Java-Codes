import java.lang.*;

class MethodDemo
{
    int max(int x,int y)
   {
    if(x>y)
        return x;
    else
        return y;
   }
   /* 
   public static void main(String args[])
   {
    int a=10,b=15,c;
    c=max(a,b);
    System.out.println(c);
   }
   */

   public static void main(String args[])
   {
        int a=10,b=15;
        MethodDemo mp=new MethodDemo();
        System.out.println(mp.max(a,b));
   }
}