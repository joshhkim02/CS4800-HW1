public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;

    // Employee Constructor
    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    // Setters
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName; 
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setSSN(String newSSN) {
        this.SSN = newSSN;
    }
}
