// Ivan Zelenkov Problem 6 (FizzBuzz)
import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {

            int number = input.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("fizzbuzz");
            }
            else {
                if (number % 3 == 0) {
                    System.out.println("fizz");
                } else if (number % 5 == 0) {
                    System.out.println("buzz");
                } else if (number % 3 != 0 && number % 5 != 0) {
                    System.out.println(number);
                }
            }
        }
        input.close();
    }
}
