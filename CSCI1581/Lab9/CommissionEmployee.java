// Ivan Zelenkov Problem 2 (Employee)

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double totalSales;

    public CommissionEmployee(String name, double commissionRate, double totalSales) {
        super(name);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    @Override
    public double getPayment() {
        return commissionRate * totalSales;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", commission:%.02f%% @ $%.02f sales", commissionRate, totalSales);
    }
}
