// Ivan Zelenkov (Problem 5: AreaOfTriangle)
import java.util.Scanner;
import java.util.Locale;

public class AreaOfATriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double base = scan.nextDouble();
        double height = scan.nextDouble();;
        double area = 0.5 * base * height;
        System.out.println(area);
    }
}
