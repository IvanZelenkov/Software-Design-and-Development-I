// Ivan Zelenkov Problem 8 (Enemy Move)
import java.util.Scanner;

public class EnemyMove {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int cases = input.nextInt();

            for (int i = 0; i < cases; i++) {

                double formulaX, formulaY;

                double x1 = input.nextDouble();
                double y1 = input.nextDouble();
                int speed = input.nextInt();
                double x2 = input.nextDouble();
                double y2 = input.nextDouble();

                double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2 ));
                formulaX = (x1 + (speed / distance) * (x2 - x1));
                formulaY = (y1 + (speed / distance) * (y2 - y1));

                if (speed > distance) {
                    System.out.println("x=" + x2 + "," + " y=" + y2);
                }
                else
                    System.out.printf("x=%.1f, y=%.1f\n", formulaX, formulaY);
            }
            input.close();
        }
    }