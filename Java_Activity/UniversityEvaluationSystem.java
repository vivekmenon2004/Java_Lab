abstract class StudentEvaluation {

    protected int studentId;
    protected String studentName;

    StudentEvaluation(int id, String name) {
        studentId = id;
        studentName = name;
    }

    void displayStudentDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }

    abstract int calculateTotalMarks();

    abstract void displayGrade();
}

// UG Course
class UGCourseEvaluation extends StudentEvaluation {

    int m1, m2, m3;

    UGCourseEvaluation(int id, String name, int a, int b, int c) {
        super(id, name);
        m1 = a;
        m2 = b;
        m3 = c;
    }

    int calculateTotalMarks() {
        return m1 + m2 + m3;
    }

    void displayGrade() {
        int total = calculateTotalMarks();

        if (total >= 270)
            System.out.println("Grade : A");
        else if (total >= 240)
            System.out.println("Grade : B");
        else if (total >= 180)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }
}

// PG Course
class PGCourseEvaluation extends StudentEvaluation {

    int theory, practical, project;

    PGCourseEvaluation(int id, String name, int t, int p, int pr) {
        super(id, name);
        theory = t;
        practical = p;
        project = pr;
    }

    int calculateTotalMarks() {
        return theory + practical + project;
    }

    void displayGrade() {
        int total = calculateTotalMarks();

        if (total >= 280)
            System.out.println("Grade : A+");
        else if (total >= 240)
            System.out.println("Grade : A");
        else if (total >= 200)
            System.out.println("Grade : B");
        else
            System.out.println("Grade : Fail");
    }
}

// Certificate Course
class CertificateCourseEvaluation extends StudentEvaluation {

    int exam;
    int assignment;

    CertificateCourseEvaluation(int id, String name, int e, int a) {
        super(id, name);
        exam = e;
        assignment = a;
    }

    int calculateTotalMarks() {
        return exam + assignment;
    }

    void displayGrade() {
        int total = calculateTotalMarks();

        if (total >= 90)
            System.out.println("Grade : Excellent");
        else if (total >= 75)
            System.out.println("Grade : Good");
        else if (total >= 50)
            System.out.println("Grade : Pass");
        else
            System.out.println("Grade : Fail");
    }
}

// New Course Type
class DiplomaCourseEvaluation extends StudentEvaluation {

    int theory;
    int viva;

    DiplomaCourseEvaluation(int id, String name, int t, int v) {
        super(id, name);
        theory = t;
        viva = v;
    }

    int calculateTotalMarks() {
        return theory + viva;
    }

    void displayGrade() {
        int total = calculateTotalMarks();

        if (total >= 170)
            System.out.println("Grade : Distinction");
        else if (total >= 140)
            System.out.println("Grade : First Class");
        else if (total >= 100)
            System.out.println("Grade : Pass");
        else
            System.out.println("Grade : Fail");
    }
}

// Main Class
public class UniversityEvaluationSystem {

    public static void main(String[] args) {

        StudentEvaluation students[] = {

            new UGCourseEvaluation(101, "Rahul", 90, 88, 85),

            new PGCourseEvaluation(102, "Anu", 95, 92, 90),

            new CertificateCourseEvaluation(103, "John", 70, 20),

            new UGCourseEvaluation(104, "Meera", 75, 80, 82),

            new DiplomaCourseEvaluation(105, "Arun", 85, 88)
        };

        for (StudentEvaluation s : students) {

            s.displayStudentDetails();

            System.out.println("Total Marks : " + s.calculateTotalMarks());

            s.displayGrade();

            System.out.println("-----------------------------");
        }
    }
}