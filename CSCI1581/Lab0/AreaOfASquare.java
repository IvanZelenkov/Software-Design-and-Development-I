// Ivan Zelenkov (Problem 1: AreaOfASquare)
import java.util.Scanner;

public class AreaOfASquare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        int area = length * length;
        System.out.println(area);
    }
}
