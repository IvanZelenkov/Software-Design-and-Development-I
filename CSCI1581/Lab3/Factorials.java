// Ivan Zelenkov Problem 8 (Factorials)
import java.util.*;

public class Factorials {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {

            long fact = 1;

            int number = input.nextInt();

            if (number >= 0 && number <= 20) {
                for (int j = 1; j <= number; j++) {
                    fact = fact * j;
                }
                System.out.println(fact);
            }
        }
        input.close();
    }
}

