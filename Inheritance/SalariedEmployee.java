public class SalariedEmployee extends Employee {
    private int weeklySalary;

    // Salaried Employee Constructor
    public SalariedEmployee(String firstName, String lastName, String SSN, int weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    // Getters
    public int getWeeklySalary() {
        return weeklySalary;
    }

    // Setters
    public void setWeeklySalary(int newWeeklySalary) {
        this.weeklySalary = newWeeklySalary;
    }
}
