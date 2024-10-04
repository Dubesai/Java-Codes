import java.lang.*;
import java.util.Scanner;

class typeOfWebsite
{
    public static void main(String args[])
    {
        String url;
        System.out.println("Enter Any URL");
        Scanner sc=new Scanner(System.in);
        url=sc.nextLine();

        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("Hypertext Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }
        else if(protocol.equals("https"))
        {
            System.out.println("Hypertext Transfer Protocol Secure");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(ext.equals("gov"))
        {
            System.out.println("Government");
        }
        else if(ext.equals("org"))
        {
            System.out.println("Organization");
        }
        else if(url.equals("net"))
        {
            System.out.println("Network");
        }
        else
        {
            System.out.println("Any other type of website");
        }
    }
}