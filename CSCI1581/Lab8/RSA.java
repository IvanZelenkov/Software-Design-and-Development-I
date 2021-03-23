// Ivan Zelenkov Problem 6 (RSA)

import java.util.Random;
import java.math.BigInteger;

public class RSA {
    private BigInteger n;
    private BigInteger e;
    private BigInteger d;

    public RSA(String p, String q) {
        BigInteger pBig = new BigInteger(p);
        BigInteger qBig = new BigInteger(q);
        this.n = pBig.multiply(qBig);
        this.e = generateE(pBig, qBig);
        this.d = generateD(e, totient(pBig, qBig));
    }

    public RSA(String p, String q, String e) {
        BigInteger pBig = new BigInteger(p);
        BigInteger qBig = new BigInteger(q);
        BigInteger eBig = new BigInteger(e);
        this.n = pBig.multiply(qBig);
        this.e = generateE(pBig, qBig);
        this.d = generateD(this.e, totient(pBig, qBig));
    }

    private BigInteger totient(BigInteger p, BigInteger q) {
        BigInteger result = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        return result;
    }

    private BigInteger generateE(BigInteger p, BigInteger q) {
        Random random = new Random();
        BigInteger phi = totient(p, q);
        BigInteger e = BigInteger.probablePrime(phi.bitLength(), random);
        return e;
    }

    private BigInteger generateD(BigInteger e, BigInteger totient) {
        BigInteger d = BigInteger.ONE;
        while (!e.multiply(d).mod(totient).equals(BigInteger.ONE)) {
            d = d.add(BigInteger.ONE);
        }
        return d;
    }

    public String encrypt(String message) {
        StringBuilder string = new StringBuilder();
        char[] array = message.toCharArray();
        for (int i = 0; i < array.length; i++) {
            string.append((char) new BigInteger(Integer.toString(array[i])).modPow(e, n).intValue());
        }
        return string.toString();
    }

    public String decrypt(String message) {
        StringBuilder string = new StringBuilder();
        char[] array = message.toCharArray();
        for (int i = 0; i < array.length; i++) {
            string.append((char) new BigInteger(Integer.toString(array[i])).modPow(d, n).intValue());
        }
        return string.toString();
    }
}


