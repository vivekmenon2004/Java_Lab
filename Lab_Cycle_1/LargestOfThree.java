import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read three numbers
        System.out.print("Enter First Number (A): ");
        int A = sc.nextInt();

        System.out.print("Enter Second Number (B): ");
        int B = sc.nextInt();

        System.out.print("Enter Third Number (C): ");
        int C = sc.nextInt();

        // Find the largest number
        if (A >= B && A >= C) {
            System.out.println("Largest = " + A);
        }
        else if (B >= A && B >= C) {
            System.out.println("Largest = " + B);
        }
        else {
            System.out.println("Largest = " + C);
        }

        sc.close();
    }
}