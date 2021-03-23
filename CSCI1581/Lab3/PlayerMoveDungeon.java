// Ivan Zelenkov Problem 5 (Player Move Dungeon)
import java.util.*;

public class PlayerMoveDungeon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cases = input.nextInt();

        for(int i = 0; i < cases; i++) {

            int sizeLen = input.nextInt();
            int sizeWid = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();
            input.nextLine(); // This line is important to skip the new line character

            String moves = input.nextLine();
            // split the input moves String using space(" ") as the delimiter
            String[] move = moves.split(" ");

            // read and implement each move
            for (int j = 0; j < move.length; j++) {

                if (move[j].equals("w") && y < sizeLen)
                    y--;
                else if(move[j].equals("a") && x < sizeWid - 2)
                    x++;
                else if(move[j].equals("s") && y < sizeLen - 1)
                    y++;
                else if(move[j].equals("d") && x < sizeWid)
                    x--;
            }
            System.out.println(x + " " + y);
        }
        input.close();
    }

}