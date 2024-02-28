import java.util.Scanner;

public class a5_1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of columns/levels
        System.out.print("Enter the number of columns/levels: ");
        int columns = scanner.nextInt();

        // Display the pattern
        System.out.println("Pattern:");
        for (int i = 1; i <= columns; i++) {
            char c = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }

        scanner.close();
    }
}
