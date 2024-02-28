import java.util.Scanner;

public class ATMsystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance;
        System.out.print("Enter balance :");
        balance = scanner.nextInt();
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting the ATM system. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }
    }
}
