package _Java_Basics_01;

public class Lab013_Ifelse_Loop {
    public static void main(String[] args) {
        String str = "india"; // Input string
        int vowels = 0;       // Counter for vowels
        int consonants = 0;   // Counter for consonants
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else {
                consonants++;
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
