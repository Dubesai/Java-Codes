import java.lang.*;
import java.util.Scanner;

class conditionalStudentChallenge
{
    /* 
    public static void main(String args[])
    {
        int i;
        System.out.println("Enter Any Number");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();

        if(i%2==0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }
    }
    */
    /* 
    public static void main(String args[])
    {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        if(age>=14 && age<55)
        {
            System.out.println("You are Young");
        }
        else
        {
            System.out.println("You are Not Young");
        }

    }
    */

    public static void main(String args[])
    {
        int Maths,English,Science,Total_marks;
        float Average;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of Subject Maths");
        Maths=sc.nextInt();
        System.out.println("Enter Marks of Subject English");
        English=sc.nextInt();
        System.out.println("Enter Marks of Subject Science");
        Science=sc.nextInt();

        Total_marks=Maths+English+Science;
        System.out.println("Total Marks = "+Total_marks);

        Average=Total_marks/2;
        System.out.println("Average Score = "+Average);

        if(Average>=70)
        {
            System.out.println("Grade = 'A'");
        }
        else if(Average>=60 && Average<70)
        {
            System.out.println("Grade = 'B'");
        }
        else if(Average>=40 && Average<50)
        {
            System.out.println("Grade = 'C'");
        }
        else
        {
            System.out.println("Grade = 'F'");
        }
    }
}
