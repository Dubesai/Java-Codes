import java.lang.*;

class Strings
{
    public static void main(String args[])
    {
        String str="Java";
        
        char c[]={'A','B','C','D','E','F'};
        String str1=new String(c,1,3);

        byte b[]={64,65,66,67,68,69};
        String str2=new String(b,2,4);

        String str3=new String("Java");

        String str4="Java";

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str==str3);
        System.out.println(str==str4);
    }
}
