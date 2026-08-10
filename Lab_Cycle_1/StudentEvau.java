

abstract class StudentEvaluation {

    // Common data available for all students
    String studentName;
    int regNo;

    // Constructor
    StudentEvaluation(String studentName, int regNo) {
        this.studentName = studentName;
        this.regNo = regNo;
    }


    void displayStudent() {
        System.out.println("----------------------------");
        System.out.println("Student : " + studentName);
        System.out.println("Register No : " + regNo);
    }

    /*
     * Abstract Method
     *
     * There is NO implementation here.
     * Every subclass MUST provide its own implementation.
     */
    abstract int calculateTotal();

    /*
     * Another abstract method
     */
    abstract void displayGrade();
}


// UGCourseEvaluation.java

class UGCourseEvaluation extends StudentEvaluation {

    int assignment;
    int internal;

    UGCourseEvaluation(String name, int regNo, int assignment, int internal) {

        // Calls constructor of abstract class
        super(name, regNo);

        this.assignment = assignment;
        this.internal = internal;
    }

    /*
     * Every subclass provides its OWN implementation.
     */
    @Override
    int calculateTotal() {
        return assignment + internal;
    }

    @Override
    void displayGrade() {

        int total = calculateTotal();

        System.out.println("Total = " + total);

        if (total >= 80)
            System.out.println("Grade : A");
        else
            System.out.println("Grade : B");
    }
}


// PGCourseEvaluation.java

class PGCourseEvaluation extends StudentEvaluation {

    int theory;
    int lab;

    PGCourseEvaluation(String name, int regNo, int theory, int lab) {

        super(name, regNo);

        this.theory = theory;
        this.lab = lab;
    }

    @Override
    int calculateTotal() {
        return theory + lab;
    }

    @Override
    void displayGrade() {

        int total = calculateTotal();

        System.out.println("Total = " + total);

        if (total >= 90)
            System.out.println("Grade : A+");
        else
            System.out.println("Grade : A");
    }
}


// Main.java

public class StudentEvau {

    public static void main(String[] args) {

        /*
         * Parent class reference
         *
         * Although StudentEvaluation is abstract,
         * its reference can store subclass objects.
         *
         * This is Runtime Polymorphism.
         */

        StudentEvaluation students[] = {

            new UGCourseEvaluation("Anu", 101, 40, 45),

            new UGCourseEvaluation("Rahul", 102, 30, 40),

            new PGCourseEvaluation("Sneha", 201, 48, 45),

            new PGCourseEvaluation("Arjun", 202, 40, 42)
        };

        /*
         * Loop through every object.
         *
         * Java automatically calls the correct
         * overridden methods.
         */

        for (StudentEvaluation s : students) {

            s.displayStudent();

            s.displayGrade();
        }
    }
}