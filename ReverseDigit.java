import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int reversed = 0;
        int n = number;
        while (n > 0) {
            int digit = n % 10;          
            reversed = reversed * 10 + digit; 
            n = n / 10; 
        }
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}