package Lab9;// Ivan Zelenkov Problem 1 (Animal)

public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract void move();

    public abstract String call();
}