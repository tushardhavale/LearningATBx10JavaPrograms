package _Java_Basics;

public class Lab005_Increment
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //++a -> A -ExpA -> 11, a -> 11
        //a++ -> B -ExpB -> 11, a -> 12
        //a++ -> C -ExpC -> 12, a -> 13
    }

}
