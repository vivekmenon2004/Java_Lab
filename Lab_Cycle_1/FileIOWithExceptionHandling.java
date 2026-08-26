import java.io.*;
import java.util.Scanner;

public class FileIOWithExceptionHandling {
    public static void main(String[] args) {
        String fileName = "data.txt";

        try (PrintWriter writer =
                     new PrintWriter(new FileWriter(fileName))) {

            writer.println("Line 1: Java");
            writer.println("Line 2: Python");
            writer.println("Line 3: C++");

        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("Contents of " + fileName + ":");

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}