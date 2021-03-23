// Ivan Zelenkov Problem 7 (Flip It)
import java.util.Scanner;

public class FlipIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();
        input.nextLine();

        for (int i = 0; i < cases; i++) {
            String inputString = input.nextLine();

            // Hello => 5
            // |0|1|2|3|4|
            // |H|e|l|l|o|
            // olleH
            
            String answer = "";

            for (int j = inputString.length() - 1; j >= 0; j--) {
                answer += inputString.charAt(j);
            }

            System.out.println(answer);
        }
    }
}
