import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int rollNo;
        String course;
        double percentage;

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("-------------------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);

        sc.close();
    }
}