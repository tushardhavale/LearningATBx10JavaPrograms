package _Java_Basics;

public class Lab006_ID
{
    public static void main(String[] args)
    {
        int a=20;
        System.out.println(--a + a++ + a--);
        //--a -> A -ExpA -> 19, a -> 19
        //a++ -> B -ExpB -> 19, a -> 20
        //a-- -> C -ExpC -> 20, a -> 19
    }
}
