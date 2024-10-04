import java.lang.*;

class formattedOutput
{
    public static void main (String args[])
    {
        int i=-10;
        float f=10.2f;
        char c='A';
        String str="Hello";

        System.out.printf("%d %f %c %s  \n",i,f,c,str);//formatted output
        System.out.printf("%o %e %c %s \n",i,f,c,str);//conversion
        System.out.printf("%3$s %2$f %1$d \n",i,f,str);//argumented index
        System.out.printf("%(5d %+6.1f %5c %20s %-20s\n",i,f,c,str,str);//flags width precision

    }
}
