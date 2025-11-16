import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        String input = sc.nextLine();

        if (input.length() != 1) {
            System.out.println("Error: Please enter ONLY ONE character.");
        } else {
            char ch = input.charAt(0);
            if (!Character.isLetter(ch)) {
                System.out.println("Error: Input is NOT a letter (A-Z or a-z).");
            } else {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            }
        }
        sc.close();
    }
}
