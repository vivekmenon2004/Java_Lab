import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read Basic Salary
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate DA (10%)
        double da = (basicSalary * 10) / 100;

        // Calculate HRA (15%)
        double hra = (basicSalary * 15) / 100;

        // Calculate Gross Salary
        double grossSalary = basicSalary + da + hra;

        // Display Output
        System.out.println("\nDA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + grossSalary);

        sc.close();
    }
}
