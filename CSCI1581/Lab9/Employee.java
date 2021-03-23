// Ivan Zelenkov Problem 2 (Employee)

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public abstract double getPayment();
}
