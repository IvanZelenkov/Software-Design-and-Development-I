// Ivan Zelenkov Homework 5 (Adventure Game - Bonus)

import java.util.*; // import one of the classes from this library. In our case we need only Scanner class

public class AdventureGameBonus {
    private static int currentLocation;
    private static boolean check;
    private static Status playerStatus;
    private enum Status {NORTH, EAST, SOUTH, WEST} // NORTH = 0, EAST = 1, WEST = 2, SOUTH = 3 indexes

    public static Scanner input = new Scanner(System.in);
    public static Scanner input2 = new Scanner(System.in);

    public static int min = 0, max = 6;
    private static int currentLocationMonster;
    public static Status2 monsterStatus;
    private enum Status2 {NORTH, EAST, SOUTH, WEST}

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE

    private static final String[] roomDescriptions = {GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " guest bedroom" + ANSI_RESET + ", exits are" + RED_BOLD + " north" + ANSI_RESET + " and " + RED_BOLD + "east" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " South Hall" + ANSI_RESET + ", exits are " + RED_BOLD + "north" + ANSI_RESET + "," + RED_BOLD + " east" + ANSI_RESET + "," + " and " + RED_BOLD + "west" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " Dining Room" + ANSI_RESET + ", exits are " + RED_BOLD + "north" + ANSI_RESET +" and " + RED_BOLD + "west" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " Master Bedroom" + ANSI_RESET + ", exits are " + RED_BOLD + "east" + ANSI_RESET +" and " + RED_BOLD + "south" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " North Hall" + ANSI_RESET + ", exits are " + RED_BOLD + "north" + ANSI_RESET + "," + RED_BOLD + " east" + ANSI_RESET + "," + RED_BOLD + " west" + ANSI_RESET + ", and" + RED_BOLD + " south" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " Kitchen" + ANSI_RESET + ", exits are " + RED_BOLD + "west" + ANSI_RESET + " and " + RED_BOLD + "south" + ANSI_RESET + ".",
            GREEN_BOLD + "You" + ANSI_RESET + " are in the" + GREEN_BOLD + " Balcony" + ANSI_RESET + ". Jum off it!",
            GREEN_BOLD + "You" + ANSI_RESET + " can't start from the" + GREEN_BOLD + " Balcony" + ANSI_RESET + " as this is a scam! Try again."};
    private static final String[] roomDescriptionsMonster = {RED_BOLD + "It" + ANSI_RESET + " is in the" + GREEN_BOLD + " guest bedroom" + ANSI_RESET + ", run away from him!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the" + GREEN_BOLD + " South Hall" + ANSI_RESET + ", run away from it!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the" + GREEN_BOLD + " Dining Room" + ANSI_RESET + ", run away from it!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the"  + GREEN_BOLD + " Master Bedroom" + ANSI_RESET + ", run away from it!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the"  + GREEN_BOLD + " North Hall" + ANSI_RESET + ", run away from it!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the"  + GREEN_BOLD + " Kitchen" + ANSI_RESET + ", run away from it!",
            RED_BOLD + "Monster" + ANSI_RESET + " is in the"  + GREEN_BOLD + " Balcony" + ANSI_RESET + ", run away from it!"};
    private static final int[][] roomsDirection = {{3, 1, -1, -1}, // Bedroom2(guest bedroom)
            {4, 2, 0, -1}, // South Hall
            {5, -1, 1, -1}, // Dining Room
            {-1, 4, -1, 0}, // Bedroom1(Master Bedroom)
            {6, 5, 3, 1}, // North Hall
            {-1, -1, 4, 2}, // Kitchen
            {-1, -1, -1, 4}}; // Balcony

    public static void main(String[] args) {
        System.out.println(RED_BOLD + "\n                                                        *****ADVENTURE GAME*****                               ___________" + ANSI_RESET);
        System.out.println(" _______________________________________________________________________________________________              " + ANSI_GREEN_BACKGROUND + "|  Balcony  |" + ANSI_RESET);
        System.out.println("|       " + RED_BOLD + "0             1              2              3               4          5         6      " + ANSI_RESET + "| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|-----------|-----------|-----------|" + ANSI_RESET);
        System.out.println("|                                                                                               | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|  Master   |   North   |           |" + ANSI_RESET);
        System.out.println("| guest Bedroom   South Hall    Dining Room    Master Bedroom   North Hall   Kitchen  Balcony   | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|  Bedroom  |   Hall    |  Kitchen  |" + ANSI_RESET);
        System.out.println("|-----------------------------------------------------------------------------------------------| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|-----------|-----------|-----------|" + ANSI_RESET);
        System.out.println("|                                                                                               | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|  guest    |   South   |  Dining   |" + ANSI_RESET);
        System.out.println("|                                                                   " + GREEN_BOLD + "MAP--------------------->   " +  ANSI_RESET + "| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|  Bedroom  |   Hall    |  Room     |" + ANSI_RESET);
        System.out.println("|_______________________________________________________________________________________________| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD +  "|___________|___________|___________|" + ANSI_RESET);

        check = true;
        startPointMonster();
        startPoint();
        while (check) { // "while" loop will work while boolean variable "check" is true
            locationMonster();
            moveMonster();
            location();
            move();
        }
    }

    public static void startPoint() {
        System.out.println("To escape from it you need to get to the " + ANSI_GREEN_BACKGROUND + "Balcony" + ANSI_RESET + " and jum off it.\nIn which room do you want to start in to be safe from the monster?\n\nEnter the number from " + RED_BOLD + "0-6: " + ANSI_RESET);
        currentLocation = input.nextInt();
        if (currentLocation == 0) System.out.println(roomDescriptions[0]);
        else if (currentLocation == 1) System.out.println(roomDescriptions[1]);
        else if (currentLocation == 2) System.out.println(roomDescriptions[2]);
        else if (currentLocation == 3) System.out.println(roomDescriptions[3]); // "currentLocation" variable will find where to go among those if statements and show the user where he/she is starting the game
        else if (currentLocation == 4) System.out.println(roomDescriptions[4]);
        else if (currentLocation == 5) System.out.println(roomDescriptions[5]);
        else if (currentLocation == 6) {
            System.out.println(roomDescriptions[7]);
            check = false;
            main(new String[0]);
        }
    }

    public static void startPointMonster() {
        currentLocationMonster = (int) (Math.random() * (max - min + 1) + min);
        System.out.println(RED_BOLD + "Monster" + ANSI_RESET + " in the house! RUN!!! " + roomDescriptionsMonster[currentLocationMonster] + "\n");
    }

    public static void locationMonster() {
        String chars = "NnSsEeWw";
        Random rnd = new Random();
        char randNum = chars.charAt(rnd.nextInt(chars.length()));

        if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[0])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[1])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[2])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[3])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[4])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[5])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        } else if (roomDescriptionsMonster[currentLocationMonster].equals(roomDescriptionsMonster[6])) {
            if (randNum == 'N' || randNum == 'n') {
                monsterStatus = Status2.NORTH;
            } else if (randNum == 'S' || randNum == 's') {
                monsterStatus = Status2.SOUTH;
            } else if (randNum == 'E' || randNum == 'e') {
                monsterStatus = Status2.EAST;
            } else if (randNum == 'W' || randNum == 'w') {
                monsterStatus = Status2.WEST;
            }
        }
    }

    public static void moveMonster() {
        int directionMonster;
        int roomMonster;
        if (monsterStatus == Status2.NORTH) { // if monsterStatus == Status2.NORTH will be equally, then if statement will work
            roomMonster = currentLocationMonster; // initial input of the user will be located at the integer variable "room"
            directionMonster = 0;
            getRoomInDirectionMonster(roomMonster, directionMonster); // method getRoomInDirectionMonster will get two parameters "room" and "direction" and use them
        }
        else if (monsterStatus == Status2.SOUTH) {
            roomMonster = currentLocationMonster;
            directionMonster = 3; // variable for the user where to exit
            getRoomInDirectionMonster(roomMonster, directionMonster);
        }
        else if (monsterStatus == Status2.EAST) {
            roomMonster = currentLocationMonster;
            directionMonster = 1;
            getRoomInDirectionMonster(roomMonster, directionMonster);
        }
        else if (monsterStatus == Status2.WEST) {
            roomMonster = currentLocationMonster;
            directionMonster = 2;
            getRoomInDirectionMonster(roomMonster, directionMonster);
        }
    }

    public static void location() { // create method location() to understand where player went (north, south, east or west) and save this direction into variable "playerStatus"
        System.out.println("\nWhat direction do you want to go?\n" + YELLOW_BOLD + "(N)" + ANSI_RESET + " North," + YELLOW_BOLD + "(S)" + ANSI_RESET + " South," + YELLOW_BOLD + "(E)" + ANSI_RESET + " East," + YELLOW_BOLD + "(W)" + ANSI_RESET + " West," + YELLOW_BOLD + "(Q)" + ANSI_RESET + " Jump off the" + YELLOW_BOLD + " Balcony " + ANSI_RESET + "if you there: ");
        String response = input2.nextLine();
        System.out.println();

        if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("n")) {
            playerStatus = Status.NORTH; // if input equals "N" or "n", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
        }
        else if (response.equalsIgnoreCase("S") || response.equalsIgnoreCase("s")) {
            playerStatus = Status.SOUTH; // if input equals "S" or "s", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
        }
        else if (response.equalsIgnoreCase("E") || response.equalsIgnoreCase("e")) {
            playerStatus = Status.EAST; // if input equals "E" or "e", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
        }
        else if (response.equalsIgnoreCase("W") || response.equalsIgnoreCase("w")) {
            playerStatus = Status.WEST; // if input equals "W" or "w", then "playerStatus" variable will be equal Status.NORTH, which I will use at the next method
        }
        else if (response.equalsIgnoreCase("Q") || response.equalsIgnoreCase("q")) {  // if input equals"Q" or "q", then program shows text to the user and quit from the game
            System.out.println("You escaped the " + RED_BOLD + "monster" + ANSI_RESET + "! The game was completed successfully!");
            check = false; // assign false to variable "check" to exit from the game
            System.exit(0);
        }
        else // if none of the above statements does not work, program will show to the user text about incorrect input
            System.out.println(RED_BOLD + "Incorrect input!" + ANSI_RESET);
    }

    public static void move() {
        int direction;
        int room;
        if (playerStatus == Status.NORTH) { // if playerStatus == Status.NORTH will be equally, then if statement will work
            System.out.println("You are on the " + RED_BOLD + "north" + ANSI_RESET + ".");
            room = currentLocation; // initial input of the user will be located at the integer variable "room"
            direction = 0;
            getRoomInDirection(room, direction); // method getRoomInDirection will get two parameters "room" and "direction" and use them
        }
        else if (playerStatus == Status.SOUTH) {
            System.out.println("You are on the " + RED_BOLD + "south" + ANSI_RESET + ".");
            room = currentLocation;
            direction = 3; // variable for the user where to exit
            getRoomInDirection(room, direction);
        }
        else if (playerStatus == Status.EAST) {
            System.out.println("You are on the " + RED_BOLD + "east" + ANSI_RESET + ".");
            room = currentLocation;
            direction = 1;
            getRoomInDirection(room, direction);
        }
        else if (playerStatus == Status.WEST) {
            System.out.println("You are on the " + RED_BOLD + "west" + ANSI_RESET + ".");
            room = currentLocation;
            direction = 2;
            getRoomInDirection(room, direction);
        }
    }

    public static void getRoomInDirection(int room, int direction) { // method getRoomInDirection takes two integer parameters
        int value = roomsDirection[room][direction]; /* values "room" and "direction" which were evaluated before will be located like row and column.
                                                                List roomDirection will find the value by those row and column, then assign to the integer variable "value" */

        if (value >= 0) { // if number in "value" more than 0,
            currentLocation = roomsDirection[room][direction];
            System.out.println((roomDescriptions[currentLocation])); // "currentLocation" will be as index in list "roomDescriptions" and find the right text to show where he/she is
        }
        else if (value == -1) // if "value" is -1 than just print current location where the user was, because there is no entrance
            System.out.println("There is no room in that direction. " + roomDescriptions[currentLocation]);
    }

    public static void getRoomInDirectionMonster(int roomMonster, int directionMonster) { // method getRoomInDirection takes two integer parameters
        int valueMonster = roomsDirection[roomMonster][directionMonster]; /* values "room" and "direction" which were evaluated before will be located like row and column.
                                                                          List roomDirection will find the value by those row and column, then assign to the integer variable "value" */

        if (valueMonster >= 0) { // if number in "value" more than 0,
            currentLocationMonster = roomsDirection[roomMonster][directionMonster];
            System.out.println(roomDescriptionsMonster[currentLocationMonster]); // "currentLocation" will be as index in list "roomDescriptions" and find the right text to show where it is
            if (currentLocation == currentLocationMonster) {
                System.out.println("The " + RED_BOLD + "monster" + ANSI_RESET + " caught you. Would you like to play again? " + RED_BOLD + "1" + ANSI_RESET + " for yes, " + RED_BOLD + "2" + ANSI_RESET + " for no");
                int restartButton = input.nextInt();
                if (restartButton == 1) {
                    main(new String[0]); // make a restart from main method
                }
                else check = false;
            }
        }
        else if (valueMonster == -1) {
            System.out.println(roomDescriptionsMonster[currentLocationMonster]);
        }
    }
}