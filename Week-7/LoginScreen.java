import java.util.Scanner;

public class LoginScreen {
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login Screen");
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            System.out.println("Login successful. Welcome, " + USERNAME + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
