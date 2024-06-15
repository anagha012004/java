import java.io.*;

public class CreateFileExample {
    public static void main(String[] args) throws{
        // Specify the file path
        String filePath = "C:/Users/anagh/OneDrive/Documents/anagha/java/FileHandling/newFile.txt";

        try {
            // Create a File object representing the file
            File file = new File(filePath);

            // Check if the file already exists
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }
    }
}
