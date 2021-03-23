// Ivan Zelenkov Problem 1 (Email)

public class EmailTester {
    public static void main(String[] args) {
        Email x = new Email("Hw", "Joe", "Me", "Hello");
        Email y = new Email("Hw2", "Tony", "You", "Hi");
        x.equals(y);
        x.toString();
    }
}
