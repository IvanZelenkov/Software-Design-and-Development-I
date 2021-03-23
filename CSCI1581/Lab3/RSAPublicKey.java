// Ivan Zelenkov Problem 2 (RSA Public Key)
import java.util.*;

public class RSAPublicKey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++){
            long p = input.nextLong();
            long q = input.nextLong();
            long e = input.nextLong();

            boolean isPrimeP = true;
            boolean isPrimeQ = true;

            //multilying (factor * factor), we bypass the value 2 and it is true instead false
            for (long factor = 2; factor * factor  <= p; factor++) {
                //check prime for p
                if (p % factor == 0) {
                    isPrimeP = false;
                    break;
                }
                //check prime for q
                if (q % factor == 0) {
                    isPrimeP = false;
                    break;
                }
            }
            // if both p and q are prime then check for e to be valid.
            if (isPrimeP && isPrimeQ) {
                long n = p * q;
                long totient = (p - 1) * (q - 1);
                // checking condition for e
                if (1 < e && e < totient) {
                    System.out.printf("RSA Public Key: n=%d e=%d\n", n, e);
                }
                // if e invalid
                else {
                    System.out.printf("Invalid e for RSA Key!\n");
                }
            }
            // if n invalid
            else {
                System.out.printf("Invalid n for RSA Key!\n");
            }
        }
        input.close();
    }
}

