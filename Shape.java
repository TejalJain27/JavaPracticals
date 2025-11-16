class Shape{
    void printShape() {
        System.out.println("This is shape");
    }
    public static void main(String[] args) {
        Square sq = new Square();
        sq.printShape();      
        sq.printRectangle();
        sq.printSquare();     
    }
}
class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}
