import java.lang.*;

class VarargsDiscount
{
    static double Discount(double ...P)
    {
        double sum=P[0];
        for(int i=1;i<P.length;i++)
        {
            sum=sum+P[i];
        }
        
        
        if(sum<500)
        {
            return sum*0.10;
        }
        else if(sum>=500 && sum<=1000)
        {
            return sum*0.15;
        }
        else
        {
            return sum*0.20;
        }
    }

    public static void main(String args[])
    {
        System.out.println(Discount(100,200,250,46));
    }
}