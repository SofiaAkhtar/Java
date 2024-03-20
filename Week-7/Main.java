//Write a program to Count the number of vowels and consonants in a given string
public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                consonantsCount++;
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantsCount);

    }
}