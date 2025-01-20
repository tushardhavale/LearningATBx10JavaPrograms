package _Java_Basics_01;

public class Lab012_AgeClassification
{
    public static void main(String[] args)
    {
        String age_string = args[0];
        int age = Integer.parseInt(age_string);
         String result = (age < 18)? "Minor": (age < 65) ? "Adult" : "Senior";
      System.out.println(result);
}
}

