import java.lang.*;

class Studentchallenge3
{
    /* 
    public static void main(String args[])
    {
        String str="0/A*B!c@1";
       
        System.out.println(str.replaceAll("\\W+",""));//we can also use RE=[^0-9a-zA-z]
    }
    */

    /* 
    public static void main(String args[])
    {
        String str="     abc    def     hij     klm   ";
        System.out.println(str.replaceAll("\\s"," ").trim());

    }
    */

    public static void main(String args[])
    {
        String str="         abc    def      ghi      jkl       ";
        str=str.replaceAll("\\s+"," ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }

}