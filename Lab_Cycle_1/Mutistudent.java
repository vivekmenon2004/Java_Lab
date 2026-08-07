class Student {
    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    // Method to calculate grade
    public char getGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 80) return 'B';
        else if (marks >= 70) return 'C';
        else return 'D';
    }
}

public class Mutistudent {
    public static void main(String[] args) {
        // Create student objects
        Student s1 = new Student("Arun", 101, 82.5);
        Student s2 = new Student("Meena", 102, 95);

        // Display info
        System.out.println("Student 1 Details:");
        s1.displayInfo();
        System.out.println("Grade = " + s1.getGrade());

        System.out.println("\nStudent 2 Details:");
        s2.displayInfo();
        System.out.println("Grade = " + s2.getGrade());
    }
}