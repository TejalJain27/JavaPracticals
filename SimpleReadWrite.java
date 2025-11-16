import java.io.*;
public class SimpleReadWrite{
    public static void main(String[] args) {
        String fileName = "C:\\\\Users\\\\TEJAL JAIN\\\\OneDrive - The Northcap university\\\\Documents";

        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Hello, this is a file handling example.");
            fw.close();
            FileReader fr = new FileReader(fileName);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
