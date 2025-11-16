import java.util.Scanner;
class Area {
    int length;
    int breadth;
    Area(int l, int b) {
        length = l;
        breadth = b;
    }
    int returnArea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Area rect = new Area(length, breadth);
        System.out.println("Area of Rectangle = " + rect.returnArea());
        sc.close();
    }
}
