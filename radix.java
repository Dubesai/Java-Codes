import java.lang.*;
import java.util.Scanner;

class radix
{
    public static void main(String args[])
    {
        String str;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        if(str.matches("[0|1]+"))
        {
            System.out.println("The number is Binary and Radix is 2");
        }
        else if(str.matches("[0-7]+"))
        {
            System.out.println("The number is Octal and Radix is 8");
        }
        else if(str.matches("[0-9]+"))
        {
            System.out.println("The number is Decimal and Radix is 10");
        }
        else if(str.matches("[0-9A-F]+"))
        {
            System.out.println("The number is Hexaecimal and Radix is 16");
        }
        else
        {
            System.out.println("The number is Invalid");
        }
    }
}