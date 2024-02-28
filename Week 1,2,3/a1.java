//Wap to display the employee details of 5 employees using scanner class.
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String names[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nEmployee Names:");
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

    }
}
