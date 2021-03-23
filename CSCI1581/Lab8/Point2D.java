// Ivan Zelenkov Problem 3 (Point2D)

public class Point2D {
    private double x, y;

    public Point2D (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void moveBy(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D other) {
        return Math.sqrt(Math.pow(other.getX() - this.x, 2) + Math.pow(other.getY() - this.y, 2));
    }

    public String toString() {
        return String.format("(%.1f,%.1f)", this.x, this.y);
    }
}
