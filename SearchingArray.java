import java.lang.*;
import java.util.Scanner;

class SearchingArray
{
    public static void main(String args[])
    {
        System.out.println("Enter Value Which You Want To Search");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        int A[]={3,9,7,8,12,6,5,5,4,10};

        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Value is at Index "+i);
                System.exit(0);
            }
            
        }
        System.out.println("Value Not Found");
    }
}