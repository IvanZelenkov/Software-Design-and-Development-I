// Ivan Zelenkov Problem 2 (Employee)

public class SalaryEmployee extends Employee {
    private double salary;

    public SalaryEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getPayment() {
        return salary / 24;
    }

    @Override
    public String toString() {
        return String.format("%s, salary:$%.02f", super.toString(), salary);
    }

}
