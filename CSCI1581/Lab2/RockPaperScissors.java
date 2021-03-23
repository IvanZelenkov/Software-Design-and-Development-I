// Ivan Zelenkov Problem 7(Rock Paper Scissors)
import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String p1 = input.next();
            String p2 = input.next();

            if (p1.equals(p2)) {
                System.out.println("Tie!");
            }
            if (p1.equals("rock") && p2.equals("paper")) {
                System.out.println("Player 2 wins!");
            }
            if (p1.equals("rock") && p2.equals("scissors")) {
                System.out.println("Player 1 wins!");
            }
            if (p1.equals("paper") && p2.equals("rock")) {
                System.out.println("Player 1 wins!");
            }
            if (p1.equals("paper") && p2.equals("scissors")) {
                System.out.println("Player 2 wins!");
            }
            if (p1.equals("scissors") && p2.equals("paper")) {
                System.out.println("Player 1 wins!");
            }
            if (p1.equals("scissors") && p2.equals("rock")) {
                System.out.println("Player 2 wins!");
            }
        }
    }
}
