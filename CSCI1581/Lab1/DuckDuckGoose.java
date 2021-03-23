// Ivan Zelenkov (Problem 9: Duck Duck Goose!)
import java.util.*;

public class DuckDuckGoose {
    public static void main(String[] args) {
        int goose;

        Scanner scan = new Scanner(System.in);

        int kids = scan.nextInt();
        int ducks = scan.nextInt();

        if (kids > ducks) {
            goose = kids - (kids - ducks);
            System.out.println(goose);
        }
        if (kids == ducks) {
            goose = kids % ducks;
            System.out.println(goose);
        }
        else if (kids < ducks){
            goose = ducks % kids;
            System.out.println(goose);
        }

    }
}