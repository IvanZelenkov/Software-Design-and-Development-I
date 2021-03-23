package Lab8;// Ivan Zelenkov Problem 4 (ATM Banking)

public class Account {
    private static int count;
    private String name;
    private String pin;
    private int id;
    private double balance;

    public Account(String name, String pin) {
        this.name = name;
        this.pin = pin;
        this.balance = 0;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isPin(String attempt) {
        if (attempt.equals(pin))
            return true;
        else
            return false;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }

    public double withdraw(double amount) {
        if(amount <= balance) {
            this.balance -= amount;
        }
        return balance;
    }

    public String toString() {
        return String.format("Name: %s, Account ID: %d, Balance: $%.02f", name, id, balance);
    }
}
