import java.io.*;

public class CreateFile {
    public static void main(String args) throws IOException {
        File f = new File("C:\\Users\\anagh\\OneDrive\\Documents\\anagha\\java\\FileHandling");
        if (f.createNewFile()) {
            System.out.println("File created Successfully");
        } else {
            System.out.println("File already exists");
        }
    }
}