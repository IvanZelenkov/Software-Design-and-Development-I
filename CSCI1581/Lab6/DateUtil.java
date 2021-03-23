// Ivan Zelenkov Problem 5 (Date Util)

public class DateUtil {
    public static String format(int month, int day, int year) {
        return String.format("%02d/%02d/%d", month, day, year);
    }

    public static String format(String date, int year) {
        return date + ", " + year;
    }

    public static String format(String month, int day, int year) {
        return String.format("%s %02d, %d", month, day, year);
    }

    public static String format(String month, String day, String year) {
        return month + " " + day + ", " + year;
    }
}
