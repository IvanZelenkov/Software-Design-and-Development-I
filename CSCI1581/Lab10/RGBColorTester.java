// Ivan Zelenkov Problem 2 (RGBColor)

public class RGBColorTester {
    public static void main(String[] args) {
        RGBColor x = new RGBColor(99, 16, 0);
        RGBColor y = new RGBColor(0, 0, 0);
        boolean t = x.equals(y);
        String dec = x.toString();
        String hex = x.toHex();
        System.out.println(dec);
        System.out.println(hex);
    }
}
