import java.io.File;

public class ChangePermission{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\TEJAL JAIN\\OneDrive - The Northcap university\\Documents");
        if (f.exists()) {
            boolean r = f.setReadable(true);
            boolean w = f.setWritable(true);
            boolean e = f.setExecutable(true);

            System.out.println("Readable: " + r);
            System.out.println("Writable: " + w);
            System.out.println("Executable: " + e);
        } else {
            System.out.println("File not found!");
        }
    }
}
