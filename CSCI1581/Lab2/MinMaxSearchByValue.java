// Ivan Zelenkov Problem 4(Min/Max Search By Value)
import java.util.Scanner;

public class MinMaxSearchByValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt(); // Number of times the program should run
        input.nextLine(); // This line is important to skip the new line character

        for (int i = 0; i < cases; i++) {
            String sequence = input.nextLine();

            //Create scanner from the sequence of the numbers
            Scanner reader = new Scanner(sequence);

            // The first number of the sequence is considered to be the min and the max
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                //Check for max
                if (number > max) {
                    max = number;
                }

                //Check for min
                if (number < min) {
                    min = number;
                }
            }
            System.out.println(sequence);
            System.out.println(min);
            System.out.println(max);
            System.out.println();
        }
    }
}