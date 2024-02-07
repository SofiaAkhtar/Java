// Wap to check if the sum of all the digits of an input number is
// prime, armstrong, perfect or not. Check for all the three and
// display output accordingly.
// Example-
// Input a number- 250
// Sum is 7
// Prime: Y
// Armstrong: Y
// Perfect: N

import java.util.Scanner;

public class a2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Calculate sum of digits
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if sum is prime
        boolean isPrime = sum > 1;
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Check if sum is Armstrong
        int armstrongSum = 0;
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            armstrongSum += Math.pow(digit, 3); // For 3-digit Armstrong number
            temp /= 10;
        }
        boolean isArmstrong = armstrongSum == sum;

        // Check if sum is perfect
        int perfectSum = 0;
        for (int i = 1; i <= sum / 2; i++) {
            if (sum % i == 0)
                perfectSum += i;
        }
        boolean isPerfect = perfectSum == sum;

        // Display output
        System.out.println("Sum is: " + sum);
        System.out.println("Prime: " + (isPrime ? "Y" : "N"));
        System.out.println("Armstrong: " + (isArmstrong ? "Y" : "N"));
        System.out.println("Perfect: " + (isPerfect ? "Y" : "N"));

        scanner.close();
    }
}