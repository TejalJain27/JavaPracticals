import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: "); //coefficients
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;  // discriminant
        System.out.println("\nDiscriminant = " + d);
        if (d > 0) { //conditions
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The equation has TWO real roots:");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);

        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The equation has ONE real root:");
            System.out.println("Root = " + r);

        } else {
            System.out.println("The equation has NO real roots (complex roots).");}
        sc.close(); }}