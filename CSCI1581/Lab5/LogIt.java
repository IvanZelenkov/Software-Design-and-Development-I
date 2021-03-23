// Ivan Zelenkov Problem 6 (Log It)
import java.util.Scanner;

public class LogIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int maxValue = input.nextInt();
            int result = (int) Math.ceil(Math.log10(maxValue) / Math.log10(2));
            System.out.println(result);
        }
    }
}