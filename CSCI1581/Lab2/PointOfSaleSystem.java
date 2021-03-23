// Ivan Zelenkov Problem 2(Point Of Sale System)
import java.util.*;

public class PointOfSaleSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt(); // Number of times the program should run
        input.nextLine(); // This line is important to skip the new line character

        double total = 0;

        for (int i = 0; i < cases; i++) {

            String sequence = input.nextLine();

            //Create scanner from the sequence of the numbers
            Scanner reader = new Scanner(sequence);

            while (reader.hasNextInt()) {

                int choice = reader.nextInt();

                if (choice == 1)
                    total += 1.50;
                else if (choice == 2)
                    total += 1.75;
                else if (choice == 3)
                    total += 2.50;
                else if (choice == 4)
                    total += 2.75;
                else if (choice == 5)
                    total += 0.99;
                else if (choice == 6)
                    total += 1.25;
            }

            double tax = 6.5 * total / 100;
            total += tax;
            System.out.printf("Please pay $%.2f%n", total);
            System.out.println("Thank you for eating at McDowell's!");
        }
    }
}