import java.util.Scanner;
public class reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements of the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nReversed Array:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
