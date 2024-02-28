import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks for 5 subjects : ");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int m5 = scanner.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        if (total <= 199 && total >= 0)
            System.out.println("Grade - F");
        else if (total <= 250 && total >= 200)
            System.out.println("Grade - B");
        else if (total <= 300 && total >= 250)
            System.out.println("Grade - A");
        else if (total <= 400 && total >= 300)
            System.out.println("Grade - E");
        else if (total <= 500 && total >= 400)
            System.out.println("Grade - O");
        else
            System.err.println("Invalid Input");
    }
}
