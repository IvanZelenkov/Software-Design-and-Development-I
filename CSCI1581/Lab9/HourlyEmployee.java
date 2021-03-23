// Ivan Zelenkov Problem 2 (Employee)

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPayment() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", hourly:$%.02f @ %.02f hours", hourlyRate, hoursWorked);
    }
}
