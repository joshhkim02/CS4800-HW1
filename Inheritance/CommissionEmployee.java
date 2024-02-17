public class CommissionEmployee extends Employee{
    private int commissionRate;
    private int grossSales;

    // Commission Employee Constructor
    public CommissionEmployee(String firstName, String lastName, String SSN, int commissionRate, int grossSales) {
        super(firstName, lastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Getters
    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }

    // Setters
    public void setCommissionRate(int newCommissionRate) {
        this.commissionRate = newCommissionRate;
    } 

    public void setGrossSales(int newGrossSales) {
        this.grossSales = newGrossSales;
    }
}
