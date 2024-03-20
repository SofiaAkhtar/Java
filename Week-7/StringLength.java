import java.util.Scanner;

public class StringLength {
    public static int findStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = findStringLength(inputString);
        System.out.println("Length of the string: " + length);

        scanner.close();
    }
}
