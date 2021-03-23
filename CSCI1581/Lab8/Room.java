// Ivan Zelenkov Problem 2 (Dungeon Crawl)

public class Room {
    private String name, description;
    private Room north, east, west, south;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getExits() {
        StringBuilder exits = new StringBuilder();
        if (north != null) {
            exits.append("[N]orth: ").append(this.north.name).append("\n");
        }
        if (east != null) {
            exits.append("[E]ast: ").append(this.east.name).append("\n");
        }
        if (west != null) {
            exits.append("[W]est: ").append(this.west.name).append("\n");
        }
        if (south != null) {
            exits.append("[S]outh: ").append(this.south.name).append("\n");
        }
        return exits.toString();
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }

    public String getName() {
        return name;
    }

    public void setExits(Room n, Room e, Room w, Room s) {
        this.north = n;
        this.east = e;
        this.west = w;
        this.south = s;
    }

    public String toString(){
        return String.format("["+ this.name + "]\n" + this.description + "\n" + getExits());
    }
}
