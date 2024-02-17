package Polymorphism;

public class Ship {
    private String name;
    private String year;

    // Ship Constructor
    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setYear(String newYear) {
        this.year = newYear;
    }

    // Print function
    public void printInfo() {
        System.out.println("Ship name: " + name + "\nYear Built: " + year);
    }
}
