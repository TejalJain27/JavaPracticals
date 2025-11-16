import java.util.Scanner;
public class ArraySum {
    public static int sumAll(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum; }
    public static int sumAlternate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();}
        System.out.println("1. Sum of all elements");
        System.out.println("2. Sum of alternate elements");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum of all elements = " + sumAll(arr));
                break;

            case 2:
                System.out.println("Sum of alternate elements = " + sumAlternate(arr));
                break;

            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
