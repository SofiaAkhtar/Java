import java.util.Scanner;

public class StrongPasswordChecker {
    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        if (password.trim().length() != password.length()) {
            return false;
        }

        password = password.replaceAll("\\s", "$");

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (isStrongPassword(enteredPassword)) {
            System.out.println("Entered password is a strong password.");
        } else {
            System.out.println("Entered password is not a strong password.");
        }

        scanner.close();
    }
}
