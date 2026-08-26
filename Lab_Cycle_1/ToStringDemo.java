class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Student s = new Student("Ravi", 102);

        System.out.println(s);
        System.out.println("Student Details: " + s);
    }
}