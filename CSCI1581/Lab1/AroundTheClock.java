// Ivan Zelenkov (Problem 8: Around the Clock!)
import java.util.*;

public class AroundTheClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int departureTime = scanner.nextInt();
        int travelTime = scanner.nextInt();

        int arrivalTime = (departureTime + travelTime) % 12;
        System.out.println(arrivalTime);
    }
}

