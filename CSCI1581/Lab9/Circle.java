// Ivan Zelenkov Problem 2 (Shape)

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public double area() {
        return Math.PI * (Math.pow(radius, 2));
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle";
    }
}
