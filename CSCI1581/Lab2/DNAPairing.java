// Ivan Zelenkov Problem 8(DNA Pairing)
import java.util.*;

public class DNAPairing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        input.nextLine(); // This line is important to skip the new line character(\n)

        for (int i = 0; i < cases; i++) {

            String sequence = input.nextLine();

            //Create scanner from the sequence of the numbers
            Scanner reader = new Scanner(sequence).useDelimiter("");

            System.out.println(sequence);

            while (reader.hasNext()) {

                String choice = reader.next();

                if (choice.equals("A")) {
                    System.out.print("T");
                }
                if (choice.equals("T")) {
                    System.out.print("A");
                }
                if (choice.equals("G")) {
                    System.out.print("C");
                }
                else if (choice.equals("C")) {
                    System.out.print("G");
                }
            }
            System.out.println();
            System.out.println();
        }
    }
}