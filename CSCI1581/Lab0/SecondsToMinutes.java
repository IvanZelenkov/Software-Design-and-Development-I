// Ivan Zelenkov (Problem 6: SecondsToMinutes)
import java.util.Scanner;

public class SecondsToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double seconds = scan.nextDouble();
        double minutes = seconds / 60;
        System.out.println(minutes);
    }
}
