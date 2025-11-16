import java.util.Scanner;
public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        char choice;
        do {
            System.out.print("Enter number of rows for the rhombus: ");
            int rows = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a character to build the rhombus: ");
            char ch = sc.next().charAt(0);
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(ch);
                }
                System.out.println();}
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
            System.out.print("Do you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice != 'N' && choice != 'n');
        sc.close();  
        System.out.println("Program exited. Thank you!");
    }}
