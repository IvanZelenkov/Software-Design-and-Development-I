// Ivan Zelenkov (Problem 7: How odd!)
import java.util.*;

public class HowOdd {
    public static void main(String[] args) {
        boolean result = true;
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        if (n % 2 == 0) {
            result = false;
            System.out.println(result);
        }
        else
            System.out.println(result);
    }
}
