// Ivan Zelenkov (Problem 2: MinutesToSeconds)
import java.util.Scanner;

public class MinutesToSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int minute = scan.nextInt();
        int seconds = 60 * minute;
        System.out.println(seconds);

    }
}
