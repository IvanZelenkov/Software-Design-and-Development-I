// Ivan Zelenkov Problem 9 (Fibonacci)
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int result;
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {

            int fibNum = input.nextInt();
            int num1 = 0;
            int num2 = 1;

            for(int j = 2; j < fibNum; j++) {
                int temp = num1;
                num1 = num2;
                num2 += temp;
            }

            if (fibNum < 1) {
                result = 0;
                System.out.println(result);
            }
            else {
                result = num1 + num2;
                System.out.println(result);
            }
        }
        input.close();
    }
}
