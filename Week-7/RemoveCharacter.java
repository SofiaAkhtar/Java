import java.util.Scanner;

public class RemoveCharacter {
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String result = removeCharacter(inputString, charToRemove);
        System.out.println("Output string: " + result);

        scanner.close();
    }
}
