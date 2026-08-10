import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        File originalFile;

        // Step 1 & 2: Ask for the file name and check whether it exists
        while (true) {

            System.out.print("Enter the file name: ");
            String fileName = input.nextLine();

            originalFile = new File(fileName);

            // Check whether the specified file exists
            if (originalFile.exists()) {
                System.out.println("File found.");
                break;
            }

            // If file does not exist, ask the user again
            System.out.println("File does not exist. Please try again.");
        }

        try {

            // Step 3: Read and display the first five lines
            System.out.println("\nFirst five lines of the original file:");

            Scanner reader = new Scanner(originalFile);

            int count = 0;

            while (reader.hasNextLine() && count < 5) {

                System.out.println(reader.nextLine());
                count++;
            }

            reader.close();

            // Step 4: Create a temporary file
            File tempFile = new File("temp.txt");

            // PrintWriter is used to write the modified content
            PrintWriter writer = new PrintWriter(tempFile);

            // Open the original file again for reading
            reader = new Scanner(originalFile);

            // Step 5: Read every line and flip the case
            while (reader.hasNextLine()) {

                String line = reader.nextLine();
                String modifiedLine = "";

                // Process every character in the line
                for (int i = 0; i < line.length(); i++) {

                    char ch = line.charAt(i);

                    // Convert uppercase character to lowercase
                    if (Character.isUpperCase(ch)) {

                        modifiedLine += Character.toLowerCase(ch);

                    }
                    // Convert lowercase character to uppercase
                    else if (Character.isLowerCase(ch)) {

                        modifiedLine += Character.toUpperCase(ch);

                    }
                    // Keep numbers, spaces and symbols unchanged
                    else {

                        modifiedLine += ch;
                    }
                }

                // Write the modified line to the temporary file
                writer.println(modifiedLine);
            }

            reader.close();
            writer.close();

            // Step 6: Delete the original file
            if (originalFile.delete()) {

                // Rename the temporary file to the original file name
                if (tempFile.renameTo(originalFile)) {

                    System.out.println(
                        "\nFile updated successfully."
                    );

                } else {

                    System.out.println(
                        "Error: Could not rename temporary file."
                    );
                }

            } else {

                System.out.println(
                    "Error: Could not delete the original file."
                );
            }

            // Step 7: Read and display the first five lines
            // of the modified file
            System.out.println(
                "\nFirst five lines of the updated file:"
            );

            reader = new Scanner(originalFile);

            count = 0;

            while (reader.hasNextLine() && count < 5) {

                System.out.println(reader.nextLine());
                count++;
            }

            reader.close();

        }
        catch (FileNotFoundException e) {

            // Handle file-related errors
            System.out.println(
                "File error: " + e.getMessage()
            );

        }
        catch (Exception e) {

            // Handle any other unexpected errors
            System.out.println(
                "An error occurred: " + e.getMessage()
            );

        }
        finally {

            // Close the Scanner used for user input
            input.close();
        }
    }
}