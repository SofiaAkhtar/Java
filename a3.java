//Wap to convert an input number into its respective binary and
//hexadecimal(without using any builtin library or method)

import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        // Convert to binary
        StringBuilder binary = new StringBuilder();
        int temp = number;
        while (temp > 0) {
            binary.insert(0, temp % 2);
            temp /= 2;
        }
        System.out.println("Binary: " + binary);

        // Convert to hexadecimal
        StringBuilder hexadecimal = new StringBuilder();
        temp = number;
        while (temp > 0) {
            int remainder = temp % 16;
            if (remainder < 10)
                hexadecimal.insert(0, remainder);
            else
                hexadecimal.insert(0, (char) ('A' + remainder - 10));
            temp /= 16;
        }
        System.out.println("Hexadecimal: " + hexadecimal);

        scanner.close();
    }
}