import java.util.Scanner;
public class EvenOddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] evenArray = new int[n];
        int[] oddArray = new int[n];

        int evenCount = 0, oddCount = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenArray[evenCount] = arr[i];
                evenCount++;
            } else {
                oddArray[oddCount] = arr[i];
                oddCount++;
            }}
        System.out.print("\nOriginal Array (" + n + " elements): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEven Array (" + evenCount + " elements): ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.print("\nOdd Array (" + oddCount + " elements): ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        sc.close();
    }
}
