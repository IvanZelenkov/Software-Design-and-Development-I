package Lab9;// Ivan Zelenkov Problem 1 (Animal)

public class Bird extends Animal {

    public Bird() {
        super("Bird");
    }

    public void move() {
        System.out.println(getType()+" flies");
    }

    public String call() {
        return "chirp chirp";
    }
}