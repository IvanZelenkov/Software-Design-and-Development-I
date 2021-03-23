// Ivan Zelenkov Problem 5 (Autocorrect)
import java.util.Scanner;

public class Autocorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cases; i++) {
            String inputText = scanner.nextLine();
            String dict = scanner.nextLine();
            translate(inputText, dict);
        }
        scanner.close();
    }

    public static void translate(String input, String dict) {
        Scanner reader = new Scanner(dict);

        while (reader.hasNextLine()) {
            String oldWord = reader.next();
            String newWord = reader.next();
            input = input.replace(oldWord, newWord);
        }
        System.out.println(input);
        reader.close();
    }
}
