// Ivan Zelenkov Problem 5(Min/Max Search By Index)
import java.util.Scanner;

public class MinMaxSearchByIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt(); // Number of times the program should run
        input.nextLine(); // This line is important to skip the new line character

        for (int i = 0; i < cases; i++) {
            int index = 0;
            String sequence = input.nextLine();

            //Create scanner from the sequence of the numbers
            Scanner reader = new Scanner(sequence);

            // The first number of the sequence is considered to be the min and the max
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            String maxIndex = "";
            String minIndex = "";

            while (reader.hasNextInt()) {
                int number = reader.nextInt();

                    //Check for max
                    if (number > max) {
                        max = number;
                        maxIndex = "" + index;
                    }
                    else if (number == max) {
                        maxIndex += " " + index;
                    }
                    //Check for min
                    if (number < min) {
                        min = number;
                        minIndex = "" + index;
                    }
                    else if (number == min) {
                        minIndex += " " + index;
                    }

                    index++;
            }

            System.out.println(sequence);
            System.out.println(minIndex);
            System.out.println(maxIndex);
            System.out.println();
        }
    }
}
