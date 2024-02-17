public class HourlyEmployee extends Employee{
    private int hourlyWage;
    private int hoursWorked;

    // Hourly Employee Constructor
    public HourlyEmployee(String firstName, String lastName, String SSN, int hourlyWage, int hoursWorked) {
        super(firstName, lastName, SSN);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public int getHourlyWage() {
        return hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    // Setters
    public void setHourlyWage(int newHourlyWage) {
        this.hourlyWage = newHourlyWage;
    }

    public void setHoursWorked(int newHoursWorked) {
        this.hoursWorked = newHoursWorked;
    }
}
