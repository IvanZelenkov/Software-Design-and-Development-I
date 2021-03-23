// Ivan Zelenkov Problem 1 (Animal)

public class Dog extends Animal {

    public Dog() {
        super("Dog");
    }

    public void move() {
        System.out.println(getType() + " runs");
    }

    public String call() {
        return "roof roof";
    }
}