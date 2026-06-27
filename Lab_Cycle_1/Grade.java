import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read marks
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Determine grade
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        }
        else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade = B");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade = C");
        }
        else {
            System.out.println("Grade = D");
        }

        sc.close();
    }
}