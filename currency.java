import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double new_amt = 0, amt;
        System.out.print("Enter the amount to convert to currency :");
        amt = scanner.nextInt();
        System.out.println(" Enter 1 to Convert Rupees to Dollar");
        System.out.println(" Enter 2 to Convert Rupees to yen");
        System.out.println(" Enter 3 to Convert Rupees to ");

        int s = scanner.nextInt();
        switch (s) {
            case 1:
                new_amt = amt / 100;
                break;
            case 2:
                new_amt = amt / 200;
                break;
            case 3:
                new_amt = amt * 10;
                break;
            default:
                System.err.println("Invalid Statement");
        }
        System.out.println("New Amount in different currency :" + new_amt);
    }

}
