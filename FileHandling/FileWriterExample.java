import java.io.IOException;
import java.io.FileWriter;

class FileWriterExample {
    public static void main(String args[]) {
        try {
            // Step 1: Create a FileWriter object for the file "abc.txt"
            FileWriter fw = new FileWriter("abc.txt");

            // Step 2: Write a single character (ASCII value 100) to the file
            fw.write(100);

            // Step 3: Write a string "Cse in SSGMCE" to the file
            fw.write("Cse in SSGMCE");

            // Step 4: Write a newline character to the file
            fw.write("\n");

            // Step 5: Write an array of characters {'a', 'b', 'c', 'd', 'e'} to the file
            char[] ch = { 'a', 'b', 'c', 'd', 'e' };
            fw.write(ch);

            // Step 6: Write another newline character to the file
            fw.write("\n");

            // Step 7: Flush and close the FileWriter to ensure data is written to the file

            fw.close();

            System.out.println("Data written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
