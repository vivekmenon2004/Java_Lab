import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two integers
        System.out.print("Enter First Number (A): ");
        int A = sc.nextInt();

        System.out.print("Enter Second Number (B): ");
        int B = sc.nextInt();

        // Perform arithmetic operations
        int addition = A + B;
        int subtraction = A - B;
        int multiplication = A * B;
        int division = A / B;
        int modulus = A % B;

        // Display results
        System.out.println("\nAddition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Modulus = " + modulus);

        sc.close();
    }
}
