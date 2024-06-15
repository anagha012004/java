import java.io.*;

class FileWriter {
    public static void main(String args[]) {
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(100);
        fw.write("Cse in SSGMCE");
        fw.write("\n");
        char[] ch = { 'a', 'b', 'c', 'd', 'e' };
        fw.write(ch);
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}