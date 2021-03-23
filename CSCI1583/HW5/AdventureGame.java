// Ivan Zelenkov Homework 5 (Adventure Game)

import java.util.*; // import one of the classes from this library. In our case we need only Scanner class

public class AdventureGame {
        private static int currentLocation;
        private static boolean check;
        private static Status playerStatus;
        private static final int NUMBER_OF_ROOMS = 7;

        private enum Status {NORTH, EAST, SOUTH, WEST} // NORTH = 0, EAST = 1, WEST = 2, SOUTH = 3 indexes

        public static Scanner input = new Scanner(System.in);
        public static Scanner input2 = new Scanner(System.in);

        private static final String[] roomDescriptions = {"You are in the guest bedroom, exits are north and east.",            // index 0
                "You are in the South Hall, exits are north, east, and west.",             // index 1
                "You are in the Dining Room, exits are north and west.",                   // index 2
                "You are in the Master Bedroom, exits are east and south.",                // index 3
                "You are in the North Hall, exits are north, east, west, and south.",      // index 4
                "You are in the Kitchen, exits are west and south.",                       // index 5
                "You are in the Balcony, exit is south."};                                // index 6
        private static final int[][] roomsDirection = {{3, 1, -1, -1}, // Bedroom2(guest bedroom)
                {4, 2, 0, -1}, // South Hall
                {5, -1, 1, -1}, // Dining Room
                {-1, 4, -1, 0}, // Bedroom1(Master Bedroom)
                {6, 5, 3, 1}, // North Hall
                {-1, -1, 4, 2}, // Kitchen
                {-1, -1, -1, 4}}; // Balcony

        public static void main(String[] args) {
                check = true;
                startPoint();
                while (check) { // "while" loop will work while boolean variable "check" is true
                        location();
                        move();
                }
        }

        public static void startPoint() {
                System.out.println("\n                                                        *****ADVENTURE GAME*****                                                                 ___________");
                System.out.println(" __________________________________________________________________________________________________________________________________              |  Balcony  |");
                System.out.println("|                                           0             1              2              3               4          5         6     | |-----------|-----------|-----------|");
                System.out.println("|  In which room do you want to be?                                                                                                | |  Master   |   North   |           |");
                System.out.println("|                                     guest Bedroom   South Hall    Dining Room    Master Bedroom   North Hall   Kitchen  Balcony  | |  Bedroom  |   Hall    |  Kitchen  |");
                System.out.println("|----------------------------------------------------------------------------------------------------------------------------------| |-----------|-----------|-----------|");
                System.out.println("|                                                                                                                                  | |  guest    |   South   |  Dining   |");
                System.out.println("|                                                                                                       MAP-------------------->   | |  Bedroom  |   Hall    |  Room     |");
                System.out.println("|__________________________________________________________________________________________________________________________________| |___________|___________|___________|");
                System.out.println("Enter the number from 0-6: ");
                currentLocation = input.nextInt();
                if (currentLocation == 0) System.out.println(roomDescriptions[0]);
                else if (currentLocation == 1) System.out.println(roomDescriptions[1]);
                else if (currentLocation == 2) System.out.println(roomDescriptions[2]);
                else if (currentLocation == 3)
                        System.out.println(roomDescriptions[3]); // "currentLocation" variable will find where to go among those if statements and show the user where he/she is starting the game
                else if (currentLocation == 4) System.out.println(roomDescriptions[4]);
                else if (currentLocation == 5) System.out.println(roomDescriptions[5]);
                else if (currentLocation == 6) System.out.println(roomDescriptions[6]);
        }

        public static void location() { // create method location() to understand where player went (north, south, east or west) and save this direction into variable "playerStatus"
                System.out.println("What direction do you want to go?\n(N) North, (S) South, (E) East, (W) West, (Q) Quit: "); // prompt to the user
                String response = input2.nextLine();

                if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("n")) {
                        playerStatus = Status.NORTH; // if input equals "N" or "n", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
                } else if (response.equalsIgnoreCase("S") || response.equalsIgnoreCase("s")) {
                        playerStatus = Status.SOUTH; // if input equals "S" or "s", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
                } else if (response.equalsIgnoreCase("E") || response.equalsIgnoreCase("e")) {
                        playerStatus = Status.EAST; // if input equals "E" or "e", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
                } else if (response.equalsIgnoreCase("W") || response.equalsIgnoreCase("w")) {
                        playerStatus = Status.WEST; // if input equals "W" or "w", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
                } else if (response.equalsIgnoreCase("Q") || response.equalsIgnoreCase("q")) {  // if input equals"Q" or "q", then program shows text to the user and quit from the game
                        System.out.println("Thank you for the game! See you soon!");
                        check = false; // assign false to variable "check" to exit from the game
                        System.exit(0);
                } else // if none of the above statements does not work, program will show to the user text about incorrect input
                        System.out.println("Incorrect input!");
        }

        public static void move() {
                if (playerStatus == Status.NORTH) { // if playerStatus == Status.NORTH will be equally, then if statement will work
                        System.out.println("You are on the north.");
                        int room = currentLocation; // initial input of the user will be located at the integer variable "room"
                        int direction = 0;
                        getRoomInDirection(room, direction); // method getRoomInDirection will get two parameters "room" and "direction" and use them
                } else if (playerStatus == Status.SOUTH) {
                        System.out.println("You are on the south.");
                        int room = currentLocation;
                        int direction = 3; // variable for the user where to exit
                        getRoomInDirection(room, direction);
                } else if (playerStatus == Status.EAST) {
                        System.out.println("You are on the east.");
                        int room = currentLocation;
                        int direction = 1;
                        getRoomInDirection(room, direction);
                } else if (playerStatus == Status.WEST) {
                        System.out.println("You are on the west.");
                        int room = currentLocation;
                        int direction = 2;
                        getRoomInDirection(room, direction);
                }
        }

        public static void getRoomInDirection(int room, int direction) { // method getRoomInDirection takes two integer parameters
                int value = roomsDirection[room][direction]; /* values "room" and "direction" which were evaluated before will be located like row and column.
                                                                List roomDirection will find the value by those row and column, then assign to the integer variable "value" */

                if (value >= 0) { // if number in "value" more than 0,
                        currentLocation = roomsDirection[room][direction];
                        System.out.println((roomDescriptions[currentLocation])); // "currentLocation" will be as index in list "roomDescriptions" and find the right text to show where he/she is
                } else if (value == -1) // if "value" is -1 than just print current location where the user was, because there is no entrance
                        System.out.println("There is no room in that direction. " + roomDescriptions[currentLocation]);
        }
}
