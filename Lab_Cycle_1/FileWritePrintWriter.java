import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWritePrintWriter {
    public static void main(String[] args) {
        String fileName = "output.txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println("Hello, world!");
            writer.printf("Formatted number: %.2f%n", 3.14159);
            writer.println("End of file.");

            System.out.println("Data written to " + fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Cannot write to file: " + e.getMessage());
        }
    }
}