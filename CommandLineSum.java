class CheckArgumentException extends Exception {
    public CheckArgumentException(String msg) {
        super(msg);
    }
}
public class CommandLineSum {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Error: Please enter at least 5 integer command line arguments.");
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum of first 5 command line arguments: " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
