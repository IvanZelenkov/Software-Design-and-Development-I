// Ivan Zelenkov Problem 1 (Fraction)

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = Math.abs(numerator);
        this.denominator = Math.abs(denominator);
        //this.numerator *= (numerator * denominator) < 0 ? -1 : 1;
        if (numerator * denominator < 0)
            this.numerator = this.numerator * -1;
        else
            this.numerator = this.numerator * 1;
    }

    public void setNumerator() {
        this.numerator = numerator;
    }

    public void setDenominator() {
        if (denominator != 0)
            this.denominator = denominator;
        else {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public Fraction add(Fraction other) {
        int numerator = this.numerator * other.denominator + other.numerator * denominator;
        int denominator = this.denominator * other.denominator;
        Fraction fraction = simplify(numerator, denominator);
        return fraction;
    }

    public Fraction subtract(Fraction other) {
        int numerator = this.numerator * other.denominator - other.numerator * denominator;
        int denominator = this.denominator * other.denominator;
        Fraction fraction = simplify(numerator, denominator);
        return fraction;
    }

    public Fraction multiply(Fraction other) {
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        Fraction fraction = simplify(numerator, denominator);
        return fraction;
    }

    public Fraction divide(Fraction other) {
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        Fraction fraction = simplify(numerator, denominator);
        return fraction;
    }

    public String toString() {
        return "(" + numerator + "/" + denominator + ")";
    }

    public Fraction simplify(int numerator, int denominator) {
        for (int i = denominator; i > 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator = numerator / i;// if 2/4 will be 1/2 (numerator = 2 / 2 = 1 and denominator = 2 / 1), hence 1/2 is result
                denominator = denominator / i;
            }
        }
        return new Fraction(numerator, denominator);
    }
}

