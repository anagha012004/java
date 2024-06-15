import java.io.*;

public class Demo {
    public static void main(String args[]) throws Exception {
        String FilePath = "C:\\Users\\anagh\\OneDrive\\Documents\\anagha\\java\\FileHandling\\test.txt";
        String content = "I love java";
        FileWriter fw = new FileWriter(FilePath);
        fw.write(content);
        System.out.println("Content written successfully");
        fw.close();

    }
}