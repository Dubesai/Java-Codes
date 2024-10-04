import java.lang.*;

class variableArugumentsDemo
{
    static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }

    static void show(int start,String ...S)
    {
        for(int i=0;i<S.length;i++)
        {
            System.out.println(start+". "+S[i]);
            start++;
        }
    }

    public static void main(String args[])
    {
        show(10,20,30);
        show(new int[]{40,50,60,70});
        show(6,"Sai","Golya","Shruti","Sameep");
        
    }
}