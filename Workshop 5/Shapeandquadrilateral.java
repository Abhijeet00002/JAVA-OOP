abstract class Shape {
    abstract void calculateArea();
    abstract void calculatePerimeter();
}

public class Shapeandquadrilateral extends Shape {
    int length = 10;
    int breadth = 5;

    void calculateArea() {
        System.out.println("Area = " + (length * breadth));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }

    public static void main(String[] args) {
        Shapeandquadrilateral q = new Shapeandquadrilateral();
        q.calculateArea();
        q.calculatePerimeter();
    }
}