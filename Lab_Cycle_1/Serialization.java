// 10. Serialization and deserialization

import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int id;
    transient String password;

    Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name +
                "', id=" + id +
                ", password=" + password + "}";
    }
}

public class Serialization {
    public static void main(String[] args) {
        Employee emp = new Employee("Suresh", 501, "secret123");

        try (ObjectOutputStream out =
                     new ObjectOutputStream(
                             new FileOutputStream("employee.ser"))) {

            out.writeObject(emp);
            System.out.println("Serialized: " + emp);

        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        try (ObjectInputStream in =
                     new ObjectInputStream(
                             new FileInputStream("employee.ser"))) {

            Employee restored = (Employee) in.readObject();
            System.out.println("Deserialized: " + restored);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}