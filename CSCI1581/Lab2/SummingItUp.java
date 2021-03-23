// Ivan Zelenkov Problem 1(Summing It Up)
import java.util.*;

public class SummingItUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testCases, num1, num2, sum;

        testCases = input.nextInt();

        while (testCases > 0) {
            num1 = input.nextInt();
            num2 = input.nextInt();

            sum = 0;

            if (num2 <num1) {
                for (int i = num1; i >= num2; i--) {
                    sum += i;
                }
                System.out.println(sum);
            }
            else if (num2 > num1) {
                for (int i = num1; i <= num2; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
            else if (num2 == num1)
                System.out.println(num2-num1);

            testCases--;
        }
    }
}
