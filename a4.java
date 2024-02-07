
// Wap to implement both recursive and non-recursive functions
// to find the fibonacci series.
import java.util.Scanner;

public class Fibonacci {
    // Recursive function to find nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive function to find nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms in Fibonacci series
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = scanner.nextInt();

        // Display Fibonacci series using recursive function
        System.out.println("Fibonacci series using recursive function:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();

        // Display Fibonacci series using non-recursive function
        System.out.println("Fibonacci series using non-recursive function:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }
        System.out.println();

        scanner.close();
    }
}
