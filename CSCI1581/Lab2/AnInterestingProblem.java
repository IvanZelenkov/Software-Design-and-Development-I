// Ivan Zelenkov Problem 3(An Interesting Problem)
import java.util.*;

public class AnInterestingProblem {
    public static void main(String[] args) {
        // declaring variables
        double initialAmount, interestRate, interest;
        int TestCases;

        Scanner input = new Scanner(System.in);

        TestCases = input.nextInt();

        for (int i = 1; i <= TestCases; i++) {
            initialAmount = input.nextDouble();
            interestRate = input.nextDouble();
            int count = 0;

            while (initialAmount < 1000000) {
                interest = (initialAmount * interestRate) / 100;
                initialAmount += interest;
                count += 1;
            }
            System.out.println(count + " years");
        }
    }
}