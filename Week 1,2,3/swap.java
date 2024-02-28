
// 1. WAP to swap two numbers using third variables and // without using third variables. 
import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        // Swap using a third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with a third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swapping without a third variable:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        scanner.close();
    }
}
