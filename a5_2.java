import java.util.Scanner;

public class a5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing asterisks
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
