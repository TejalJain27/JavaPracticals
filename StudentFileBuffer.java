import java.io.*;
public class StudentFileBuffer{
    public static void main(String[] args) {
        String file = "C:\\\\Users\\\\TEJAL JAIN\\\\OneDrive - The Northcap university\\\\Documents";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("1 John 8.5 A");
            bw.newLine();
            bw.write("2 Tejal 9.0 A");
            bw.newLine();
            bw.write("3 Riya 7.4 B");
            bw.newLine();

            bw.close();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("Contents of file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
