//Ivan Zelenkov, Homework 7 (Adding Players, Monsters and Items)

import java.util.*;

public class AdventureGame {
    //COLORS
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";    // RED
    public static final String ANSI_PURPLE = "\u001B[35m"; // PURPLE
    public static final String ANSI_GREEN = "\u001B[32m";  // GREEN
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE

    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);

        //create objects of each room to insert description as argument
        Room balcony = new Room(ANSI_GREEN + "Balcony" + ANSI_RESET);
        Room bedroom1 = new Room(ANSI_GREEN + "Bedroom1" + ANSI_RESET);
        Room bedroom2 = new Room(ANSI_GREEN + "Bedroom2" + ANSI_RESET);
        Room diningRoom = new Room(ANSI_GREEN + "Dining Room" + ANSI_RESET);
        Room kitchen = new Room(ANSI_GREEN + "Kitchen" + ANSI_RESET);
        Room northHall = new Room(ANSI_GREEN + "North Hall" + ANSI_RESET);
        Room southHall = new Room(ANSI_GREEN + "South Hall" + ANSI_RESET);

        //create object dungeon to insert objects of each room as arguments
        Dungeon dungeon = new Dungeon(balcony, bedroom1, bedroom2, diningRoom, kitchen, northHall, southHall);

        //create player object to insert name, health, attack power, mana of the player
        Player player = new Player(ANSI_RED + "Kratos" + ANSI_RESET, 100, 30, 0, 0);

        //create monster object to insert name, health, attack power, xp of the monster
        Monster monster = new Monster(ANSI_RED + "Valkyrie" + ANSI_RESET, 100, 20, 150, 0);

        //create curRom object to assign through Dungeon class object(dungeon) method getRoomPlayer()
        Room curRoom = dungeon.getRoomPlayer();

        //create curRomMonster object to assign through Dungeon class object(dungeon) method getRoomMonster()
        Room curRoomMonster = dungeon.getRoomMonster();

        //make nextRoom and nextRoomMonster equals null
        Room nextRoom = null;
        Room nextRoomMonster = null;

        //let gameOver be false to make while loop running
        boolean gameOver = false;

        //show map, so the game will be easier to display for user
        System.out.println(ANSI_PURPLE + "\n                                                    *****************ADVENTURE GAME*****************");
        System.out.println("                                                    Adventure Game consists of seven rooms. You will");
        System.out.println("                                                    play as the character of Kratos and your goal is");
        System.out.println("                                                    to defeat the enemy Valkyrie, who will look for");
        System.out.println("                                                    you in the dungeon.\n" + ANSI_RESET);

        System.out.println(RED_BOLD + "\n                                                                                                              _____________" + ANSI_RESET);
        System.out.println(" _______________________________________________________________________________________________              " + RED_BOLD + "|  Balcony  |" + ANSI_RESET);
        System.out.println("|       " + RED_BOLD + "1             2              3              4               5          6         7      " + ANSI_RESET + "| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|-----------|-----------|-----------|" + ANSI_RESET);
        System.out.println("|                                                                                               | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|  Master   |   North   |           |" + ANSI_RESET);
        System.out.println("| guest Bedroom   South Hall    Dining Room    Master Bedroom   North Hall   Kitchen  Balcony   | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|  Bedroom  |   Hall    |  Kitchen  |" + ANSI_RESET);
        System.out.println("|-----------------------------------------------------------------------------------------------| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|-----------|-----------|-----------|" + ANSI_RESET);
        System.out.println("|                                                                                               | " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|  guest    |   South   |  Dining   |" + ANSI_RESET);
        System.out.println("|                                                                   " + GREEN_BOLD + "MAP--------------------->   " + ANSI_RESET + "| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|  Bedroom  |   Hall    |  Room     |" + ANSI_RESET);
        System.out.println("|_______________________________________________________________________________________________| " + WHITE_BACKGROUND_BRIGHT + BLACK_BOLD + "|___________|___________|___________|" + ANSI_RESET + "\n");

        //while gameOver is false, loop will run. If true while loop will be finished
        while (!gameOver) {
            System.out.println("Current Room of " + player.getName() + ":   " + curRoom.toString() + "\n");
            System.out.println("Current Room of " + monster.getName() + ": " + curRoomMonster.getDescription() + "\n");

            //display the user stats of player and monster
            System.out.println(player);
            System.out.println(monster);

            //if locations of both character are the same, then if statement will execute
            if (curRoom == curRoomMonster) {
                if (player.getHealth() > 0 && monster.getHealth() > 0) {
                    player.takeTurn(monster);
                    player.chargeMana();
                    System.out.println(monster);
                }
            } else {
                player.chargeMana();
            }

            if (curRoomMonster == curRoom) {
                if (player.getHealth() > 0 && monster.getHealth() > 0) {
                    monster.takeTurn(player);
                    System.out.println(player);
                }
            } else {
                player.chargeMana();
            }

            if (player.getHealth() > 0) {
                System.out.println("");
            } else {
                System.out.println(RED_BOLD + "Valkyrie killed you! You are Dead!" + ANSI_RESET);
                System.out.println("Do you wish to try again? Enter" + ANSI_RED + "1" + ANSI_RESET + "to restart the game or" + ANSI_RED + "2" + ANSI_RESET + "to quit.");
                int var = input.nextInt();
                if (var == 1) {
                    main(new String[0]);
                } else
                    gameOver = true;
            }

            if (monster.getHealth() <= 0) {
                System.out.println("You defeated the Valkyrie! Game was completed successfully! Enter (Q) to quit.");
                gameOver = true;

            } else {
                System.out.print("");
            }

            System.out.println();
            System.out.print("Enter (W) North -- (S) South -- (D) East -- (A) West -- (Q) Quit:\n");
            char user = input.next().charAt(0);
            System.out.println();
            switch (user) {
                case 'W', 'w' -> nextRoom = curRoom.getNorth();
                case 'S', 's' -> nextRoom = curRoom.getSouth();
                case 'D', 'd' -> nextRoom = curRoom.getEast();
                case 'A', 'a' -> nextRoom = curRoom.getWest();
                case 'Q', 'q' -> gameOver = true;
                default -> System.out.println("Invalid choice");
            }
            if (nextRoom == null) {
                System.out.println("Invalid Exit");
            } else {
                curRoom = nextRoom;
            }

            String chars = "WSDA";
            Random rnd = new Random();
            char randNum = chars.charAt(rnd.nextInt(chars.length()));
            switch (randNum) {
                case 'W' -> nextRoomMonster = curRoomMonster.getNorth();
                case 'S' -> nextRoomMonster = curRoomMonster.getSouth();
                case 'D' -> nextRoomMonster = curRoomMonster.getEast();
                case 'A' -> nextRoomMonster = curRoomMonster.getWest();
            }
            if (nextRoomMonster == null) {
                System.out.print("");
            } else {
                curRoomMonster = nextRoomMonster;
            }
            System.out.println("Thank you for playing");
        }
    }
}
class Room {
    //declaring instance variables
    private String description;
    private Room north, east, south, west;

    //constructor
    Room(String description){
        this.description = description;
        this.north = null;
        this.south = null;
        this.east = null;
        this.west = null;
    }

    //getters and setters for setting and getting instance variables
    public void setNorth(Room north) {
        this.north = north;
    }
    public void setSouth(Room south) {
        this.south = south;
    }
    public void setEast(Room east) {
        this.east = east;
    }
    public void setWest(Room west) {
        this.west = west;
    }
    public Room getNorth() {
        return north;
    }
    public Room getSouth() {
        return south;
    }
    public Room getEast() {
        return east;
    }
    public Room getWest() {
        return west;
    }

    //set exits
    public void setExits(Room n,Room s,Room e,Room w) {
        this.north = n;
        this.south = s;
        this.east = e;
        this.west = w;
    }

    //check exits
    public String getExits() {
        String temp;
        String result = "";

        if(north != null) {
            temp = result + "North: " + this.north.getDescription() + "\t";
            result = temp;
        }
        if(south != null) {
            temp = result + "South: " + this.south.getDescription() + "\t";
            result = temp;
        }
        if(east != null) {
            temp = result + "East: " + this.east.getDescription() + "\t";
            result = temp;
        }
        if(west != null) {
            temp = result + "West: " + this.west.getDescription() + "\t";
            result = temp;
        }
        return result;
    }

    //getDescription of room where character is located
    public String getDescription() {
        return description;
    }

    //toString method to display object's information
    public String toString() {
        return description + "\nExit(s) " + getExits();
    }
}
class Dungeon {
    //declaring instance variables
    public Room balcony, bedroom1, diningRoom, bedroom2, kitchen, northHall, southHall;

    //implementation of constructor
    Dungeon(Room balcony, Room bedroom1, Room bedroom2, Room diningRoom, Room kitchen, Room northHall, Room southHall) {
        this.balcony = balcony;
        this.bedroom1 = bedroom1;
        this.bedroom2 = bedroom2;
        this.diningRoom = diningRoom;
        this.kitchen = kitchen;
        this.northHall = northHall;
        this.southHall = southHall;

        //set exits to each room
        this.balcony.setExits(null, northHall, null, null);
        this.kitchen.setExits(null, diningRoom, null, northHall);
        this.northHall.setExits(balcony, southHall, kitchen, bedroom1);
        this.southHall.setExits(northHall, null, diningRoom, bedroom2);
        this.diningRoom.setExits(kitchen, null, null, southHall);
        this.bedroom1.setExits(null, bedroom2, northHall, null);
        this.bedroom2.setExits(bedroom1, null, southHall, null);
    }

    //method define start room
    public Room getRoomPlayer() {
        return balcony;
    }

    public Room getRoomMonster() {
        return diningRoom;
    }
}

class GameCharacter {
    private String name;
    protected int health;
    private int attackPower;

    //implementation of constructor
    GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    //substract got damage from enemy
    public void takeDamage(int damage) {
        this.health = this.health - damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        if (health > 0) {
            return this.health;
        }
        else
            return this.health = 0;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String toString() {
        return String.format("Character name: " + getName() + "\nCurrent health: " + getHealth() + "\nAttack value: " + getAttackPower());
    }
}

class Player extends GameCharacter {
    private int mana;

    //implementation of constructor
    Player(String name, int health, int attackPower, int mana, int win) {
        super(name, health, attackPower);
        this.mana = mana;
    }

    public void attack(Monster theMonster) {
        theMonster.takeDamage(10);
    }

    //if mana more or equals 15, player can use it. If less, spell will not work
    public void castSpell(Monster theMonster) {
        if (mana >= 15) {
            System.out.println("\nThe spell GOLDEN FLEECE is active! Valkyrie attacked!\n");
            theMonster.takeDamage(30);
            this.mana -= 15;
        }
        else {
            System.out.println("You have no enough mana to spell!");
            theMonster.takeDamage(0);
        }
    }

    // each while loop method chatgeMana will be preincremented by 1
    public void chargeMana() {
        ++this.mana;
    }

    //show an input for the user to choose how to attack
    public void takeTurn(Monster theMonster) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'A' to attack or 'S' to activate a spell: ");
        String button = scanner.nextLine();
        if (button.equals("A") || button.equals("a")) {
            attack(theMonster);
        }
        else if (button.equals("S") || button.equals("s")) {
            castSpell(theMonster);
        }
    }

    public int getMana() {
        return mana;
    }

    public String toString() {
        return String.format(super.toString() + "\nCurrent mana level: " + getMana() +"\n");
    }
}

class Monster extends GameCharacter {
    private int xP;


    //implementation of constructor
    Monster(String name, int health, int attackPower, int xP, int win) {
        super(name, health, attackPower);
        this.xP = xP;
    }

    public void attack(Player thePlayer) {
        thePlayer.takeDamage(20);
    }

    //Monster will attack the player by object thePlayer to call method of the class Player
    public void takeTurn(Player thePlayer) {
        System.out.println("Valkyrie attacks you!" + "\n");
        attack(thePlayer);
    }

    public int getXP() {
        return xP;
    }

    public String toString() {
        return String.format(super.toString() + "\nCurrent XP: " + getXP() + "\n");
    }
}

