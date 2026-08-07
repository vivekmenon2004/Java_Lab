import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Ask the user to enter age
            System.out.print("Enter your age: ");

            // Read an integer
            int age = sc.nextInt();

            // Display the entered age
            System.out.println("Your age is: " + age);

        }
        // Catch invalid integer input
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
        // Catch any other unexpected exception
        catch (Exception e) {
            System.out.println("Error: Something unexpected happened.");
        }

        // This statement executes whether an exception occurs or not
        System.out.println("Program finished.");

        sc.close();
    }
}