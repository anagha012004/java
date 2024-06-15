import java.io.*;

public class FileDelEg {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\anagh\\OneDrive\\Documents\\anagha\\java\\FileHandling\\newFile.txt");
            if (f.delete()) {
                System.out.println("File Deletted");

            } else {
                System.out.println("File does not exist");
            }
        } catch (IOException e) {
            System.err.println("Error message" + e.getMessage());
        }
    }
}