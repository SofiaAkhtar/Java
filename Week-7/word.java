//Write a program to count the number of words in a given sentence.

public class word {
    public static void main(String[] args) {
        String str = "Sofia Akhtar";
        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count + 1));
    }
}
