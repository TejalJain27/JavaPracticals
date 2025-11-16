import java.util.Scanner;
class Complex{
    int real;
    int imag;
    Complex(int r, int i) {
        real = r;
        imag = i;}
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);}
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);}
    Complex multiply(Complex c) {
        int realPart = (this.real * c.real) - (this.imag * c.imag);
        int imagPart = (this.real * c.imag) + (this.imag * c.real);
        return new Complex(realPart, imagPart);}
    void display() {
        System.out.println(real + " + " + imag + "i");}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number:");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("Enter real and imaginary part of second complex number:");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);
        Complex prod = c1.multiply(c2);
        System.out.println("\nSum: ");
        sum.display();
        System.out.println("Difference: ");
        diff.display();
        System.out.println("Product: ");
        prod.display();

        sc.close();
    }
}
