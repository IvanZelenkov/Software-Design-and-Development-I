// Ivan Zelenkov Problem 2 (RGBColor)

public class RGBColor {
    private int red;
    private int green;
    private int blue;

    public RGBColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public boolean equals(RGBColor other) {
        return this.red == other.getRed() && this.green == other.getGreen() && this.blue == other.getBlue();
    }

    public String toHex() {
        String varHex = String.format("#%02x%02x%02x", red, green, blue);
        return varHex;
    }

    public int getRed() {
        return red;
    }


    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String toString() {
        return String.format("rgb(%s,%s,%s)", this.red, this.green, this.blue);
    }
}
