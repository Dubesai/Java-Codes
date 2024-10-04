import java.lang.*;
import java.util.Scanner;

class menudriven
{
    public static void main(String args[])
    {
        
        

        int a,b,option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        
        System.out.println("Menu");
        System.out.println("=======");
        System.out.println("1.ADD");
        System.out.println("2.SUB");
        System.out.println("3.MUL");
        System.out.println("4.DIV");
        System.out.println("5.EXIT");
        System.out.println("Enter Option Number");
        option=sc.nextInt();

        switch(option)
        {
            case 1:System.out.println("Sum is= "+(a+b));
            break;
            case 2:System.out.println("Difference is= "+(a-b));
            break;
            case 3:System.out.println("Product is= "+(a*b));
            break;
            case 4:System.out.println("Ratio is= "+(a/b));
            break;
            case 5:System.out.println("Exiting...");
            
        }
    }
}