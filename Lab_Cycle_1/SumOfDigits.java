import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find sum of digits
        while (number != 0) {

            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;

        }

        // Display result
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}