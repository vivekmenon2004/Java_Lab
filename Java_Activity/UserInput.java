import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            sc.close();
        }
    }
}