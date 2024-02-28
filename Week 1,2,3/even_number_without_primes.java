import java.util.Scanner;

public class even_number_without_primes {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = scanner.nextInt();

        for (int i = 2; i <= range; i++) {

            if ((i % 2 == 0) && (isPrime(i))) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

}