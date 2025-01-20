package _Java_Basics_01;

public class Lab011_LargestNumber
{
    public static void main(String[] args)
    {
        int a=15;
        int b=52;
        int c=20;
        int LargestNumber= (a>=b) ? ((a>=c) ? a : c) : ((b>=c) ? b:c);
        System.out.println("The largest number is: " + LargestNumber);
}
}
