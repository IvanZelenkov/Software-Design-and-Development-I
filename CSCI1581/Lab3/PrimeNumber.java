// Ivan Zelenkov Problem 1 (Prime Number)
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean result = false;

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {

            int number = input.nextInt();

            if (number % 2 != 0 && number > 1) {
                result = true;
                System.out.println(result);
            }
            else if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11) {
                result = true;
                System.out.println(result);
            }
            else {
                result = false;
                System.out.println(result);
            }
        }
        input.close();
    }
}
