// Ivan Zelenkov Problem 2 (Time)
public class Time {

    public static double secondsToMinutes(int seconds) {
        double minutes = (double)seconds / 60;
        return minutes;
    }

    public static double secondsToHours(int seconds) {
        return (double)seconds / (60 * 60);
    }

    public static double secondsToDays(int seconds) {
        return (double)seconds / (24 * 60 * 60);
    }

    public static double secondsToYears(int seconds) {
        return (double)seconds / (365*24*60*60);
    }

    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    public static double hoursToSeconds(double hours) {
        return hours * 60 * 60;
    }

    public static double daysToSeconds(double days) {
        return days * 24 * 60 * 60;
    }

    public static double yearsToSeconds(double years) {
        return years * 365 * 24 * 60 * 60;
    }
}
