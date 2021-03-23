// Ivan Zelenkov Problem 2 (Shape)

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public double area() {
        double s = (a + b + c) / 2;
        s = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(s);
    }

    public double perimeter() {
        return a + b + c;
    }

    public String toString() {
        return "Triangle";
    }
}
