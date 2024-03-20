//Write a program to reverse a string.
public class reverse {
    public static void main(String[] args) {
        String str = "Sofia Akhtar";
        String reverse_string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse_string += str.charAt(i);
        }
        System.out.println("Reverse of the string: " + reverse_string);
    }
}
