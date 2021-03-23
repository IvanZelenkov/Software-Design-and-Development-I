// Ivan Zelenkov (Problem 3: TablespoonsToTeaspoons)
import java.util.Scanner;

public class TablespoonsToTeaspoons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tablespoon = scan.nextInt();
        int teaspoon = 3 * tablespoon;
        System.out.println(teaspoon);
    }
}
