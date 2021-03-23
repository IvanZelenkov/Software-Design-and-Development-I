// Ivan Zelenkov Problem 6(Chair Scavenging)
import java.util.*;

public class ChairScavenging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine(); // This line is important to skip the new line character

        for (int i = 0; i < cases; i++) {

            int people = input.nextInt();
            int chairs = input.nextInt();

            if ((people >= 0 & chairs >= 0) && people > chairs) {
                int result = people - chairs;
                System.out.println(result);
            }
            else if (chairs >= people) {
                System.out.println(0);
            }
        }
    }
}

