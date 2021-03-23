// Ivan Zelenkov Problem 4 (Player Move Overworld)
import java.util.*;

public class PlayerMoveOverworld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for(int i = 0; i < cases; i++) {

            int x = input.nextInt();
            int y = input.nextInt();
            input.nextLine(); // This line is important to skip the new line character

            String moves = input.nextLine();
            // split the input moves String using space(" ") as the delimiter
            String[] move = moves.split(" ");

            // read and implement each move
            for (int j = 0; j < move.length; j++) {

                if (move[j].equals("w"))
                    y--;
                else if(move[j].equals("a"))
                    x--;
                else if(move[j].equals("s"))
                    y++;
                else if(move[j].equals("d"))
                    x++;
            }
            System.out.println(x + " " + y);
        }
        input.close();
    }

}