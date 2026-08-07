import java.util.Scanner;

public class AgeValidation2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;

        while (true) {

            System.out.print("Enter your age: ");

            // Check whether the input is an integer
            if (!sc.hasNextInt()) {

                System.out.println("Invalid input! Please enter an integer.");

                // Discard the invalid input
                sc.next();

                continue;
            }

            // Read the integer
            age = sc.nextInt();

            // Check whether the age is within the valid range
            if (age < 1 || age > 120) {

                System.out.println("Age out of range! Please enter a value between 1 and 120.");

                continue;
            }

            // Valid age entered
            break;
        }

        System.out.println("Your age is: " + age);

        sc.close();
    }
}