package Lab8;// Ivan Zelenkov Problem 5 (Monster Factory)

public class Monster {
    private String name;
    private int health;
    private int strength;
    private int xp;

    public Monster(String name, int health, int strength, int xp) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.xp = xp;
    }

    public static Monster spawn(String type) {
        if (type.equals("goblin")) {
            return new Monster("goblin",60,8,1);
        }
        if (type.equals("orc")) {
            return new Monster("orc",100,12,3);
        }
        return new Monster("troll",150,15,5);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getXP() {
        return xp;
    }

    public void takeDamage(int damage) {
        if(damage <= health) {
            this.health -= damage;
        }
    }

    public void attack(Player hero) {
        hero.takeDamage(this.strength);
    }

    public String toString() {
        return String.format("[%s] HP:%d, AP:%d", name, health, strength);
    }
}
