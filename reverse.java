import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rev = 0, digit;
        System.out.print("Enter the value of n: ");
        int num = scanner.nextInt();

        while (num != 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse of a number :" + rev);
    }
}
