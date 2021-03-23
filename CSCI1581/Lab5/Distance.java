// Ivan Zelenkov Problem 7 (Distance)
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();

            double formula = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2 ));

            System.out.println(formula);
        }
        input.close();
    }
}
