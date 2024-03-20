import java.util.Scanner;

public class PartialStringChecker {
    public static boolean isPartialStringPresent(String mainString, String partialString) {
        return mainString.contains(partialString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the partial string to search for: ");
        String partialString = scanner.nextLine();

        if (isPartialStringPresent(mainString, partialString)) {
            System.out.println("Partial string found in the main string.");
        } else {
            System.out.println("Partial string not found in the main string.");
        }

        scanner.close();
    }
}
