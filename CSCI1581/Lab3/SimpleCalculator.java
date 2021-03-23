// Ivan Zelenkov Problem 7 (Simple Calculator)
import java.util.*;

public class SimpleCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int num1 = input.nextInt();
            String operator = input.next();
            int num2 = input.nextInt();

            if (operator.equals("+"))
                System.out.println(num1 + num2);
            else if (operator.equals("-"))
                System.out.println(num1 - num2);
            else if (operator.equals("*"))
                System.out.println(num1 * num2);
            else if (operator.equals("/"))
                System.out.println(num1 / num2);
            else if (operator.equals("%"))
                System.out.println(num1 % num2);
            else if (operator.equals("**")) {
                int result = (int) Math.pow(num1, num2);
                System.out.println(result);
            }
        }
        input.close();
    }
}