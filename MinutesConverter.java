import java.util.Scanner;
public class MinutesConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();
        long totalDays = minutes / (60 * 24);

        long years = totalDays / 365;
        long remainingDaysAfterYears = totalDays % 365;
        long months = remainingDaysAfterYears / 30;
        long days = remainingDaysAfterYears % 30;
        System.out.println("Years: " + years + ", Months: " + months + ", Days: " + days);
        sc.close();
    }
}

