// Ivan Zelenkov (Problem 7: FarenheitToCelsius)
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * (5.0/9.0);
        System.out.println(celsius);
    }
}
