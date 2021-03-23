// Ivan Zelenkov (Problem 8: PerimeterOfARectangle)
import java.util.Scanner;

public class PerimeterOfARectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length1 = scan.nextDouble();
        double length2 = scan.nextDouble();
        double perimeter = 2.0 * (length1 + length2);
        int a = (int) perimeter;
        System.out.println(a);
    }
}
