import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

class overloadedValidation
{
    static boolean validate(String name)
    {
        return name.matches("[a-zA-z\\s]+");
    }
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Full Name");
        String FullName=sc.nextLine();
        System.out.println(validate(FullName));

        System.out.println("Enter Age of Student");
        int age=sc.nextInt();
        System.out.println(validate(age));
    }
}