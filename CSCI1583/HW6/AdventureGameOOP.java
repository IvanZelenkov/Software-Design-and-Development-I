// Ivan Zelenkov Homework 6 (Adventure Game OOP)
import java.util.*;

public class AdventureGameOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Room balcony = new Room("Balcony");
        Room bedroom1 = new Room("Bedroom1");
        Room bedroom2 = new Room("Bedroom2");
        Room diningRoom = new Room("Dining Room");
        Room kitchen = new Room("Kitchen");
        Room northHall = new Room("North Hall");
        Room southHall = new Room("South Hall");
        Dungeon dungeon = new Dungeon(balcony, bedroom1, bedroom2, diningRoom, kitchen, northHall, southHall);
        Room curRoom = dungeon.getRoom0();
        Room nextRoom = null;
        boolean gameOver = false;
        while(!gameOver) {
            //System.out.println(text);
            System.out.println("Current Room: " + curRoom.toString());
            System.out.print("Enter (N) North -- (S) South -- (E) East -- (W) West -- (Q) Quit:\n");
            char user = input.next().charAt(0);
            switch (user) {
                case 'N', 'n' -> nextRoom = curRoom.getNorth();
                case 'S', 's' -> nextRoom = curRoom.getSouth();
                case 'E', 'e' -> nextRoom = curRoom.getEast();
                case 'W', 'w' -> nextRoom = curRoom.getWest();
                case 'Q', 'q' -> gameOver = true;
                default -> System.out.println("Invalid choice");
            }
            if(nextRoom == null)
                System.out.println("Invalid Exit");
            else
                curRoom = nextRoom;
        }
        System.out.println("Thanks for playing");
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

    //getters and setters of instance variables
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
        String result = "";
        if(north != null) {
            String temp = result + "North: " + this.north.getDescription() + "\t";
            result = temp;
        }
        if(south != null) {
            String temp = result + "South: " + this.south.getDescription() + "\t";
            result = temp;
        }
        if(east != null) {
            String temp = result + "East: " + this.east.getDescription() + "\t";
            result = temp;
        }
        if(west != null) {
            String temp =  result + "North: " + this.west.getDescription() + "\t";
            result = temp;
        }
        return result;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return description + "\n" + getExits();
    }
}
class Dungeon {
    //declaring instance variables
    private Room balcony, bedroom1, diningRoom, bedroom2, kitchen, northHall, southHall;

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
    public Room getRoom0() {
        return balcony;
    }
}