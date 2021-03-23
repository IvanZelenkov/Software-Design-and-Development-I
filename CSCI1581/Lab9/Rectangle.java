// Ivan Zelenkov Problem 2 (Shape)

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle";
    }
}