public class BaseEmployee extends Employee {
    private int baseSalary;

    // Base Employee Constructor
    public BaseEmployee(String firstName, String lastName, String SSN, int baseSalary) {
        super(firstName, lastName, SSN);
        this.baseSalary = baseSalary;
    }

    // Getters
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setters
    public void setBaseSalary(int newBaseSalary) {
        this.baseSalary = newBaseSalary;
    }
}
