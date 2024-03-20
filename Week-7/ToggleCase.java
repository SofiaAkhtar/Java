import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c);
            }
        }

        return toggledString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("Toggled case string: " + toggledString);

        scanner.close();
    }
}
