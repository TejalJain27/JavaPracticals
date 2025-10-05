import java.util.Scanner;
public class SumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int n = number; n > 0; n = n / 10) {
            int digit = n % 10;  
            sum = sum + digit;  
        }
        System.out.println("Sum of digits of " + number + " = " + sum);
        sc.close();
    }
}

