// Ivan Zelenkov Problem 3 (RSA Private Key)
import java.util.*;

public class RSAPrivateKey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            long x = 1;
            boolean result = false;

            long a = input.nextLong();
            long m = input.nextLong();

            while (!result) {
                x++;
                if ((a * x) % m == 1) {
                    result = true;
                }
            }
            System.out.println(x);

        }
        input.close();
    }
}
