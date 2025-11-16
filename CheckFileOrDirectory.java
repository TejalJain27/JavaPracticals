import java.io.File;

public class CheckFileOrDirectory{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\TEJAL JAIN\\.vscode\\.vscode\\codes\\assignment-1\\java\\practical\\9");
        if (f.exists()) {
            if (f.isFile())
                System.out.println(f.getName() + " is a File");
            else if (f.isDirectory())
                System.out.println(f.getName() + " is a Directory");
        } else {
            System.out.println("The path does not exist.");
        }
    }
}
