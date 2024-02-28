import java.util.Scanner;

public class sumofdigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, d;
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        while (n != 0) {
            d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println("Sum of Digits of a number :" + sum);
    }
}
