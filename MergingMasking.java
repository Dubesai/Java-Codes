import java.lang.*;

class MergingMasking
{
    public static void main(String args[])
    {
        byte c;
        
        c=(byte) (9<<4);
        c=(byte) (12|c);

        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));

    }
}