package Polymorphism;

public class CruiseShip extends Ship{
    private int maxPassengers;

    // Cruise Ship Constructor
    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    // Getters
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Setters
    public void setMaxPassengers(int newMaxPassengers) {
        this.maxPassengers = newMaxPassengers;
    }

    // Override print function
    @Override
    public void printInfo() {
        System.out.println("Ship name: " + getName() + "\nMaximum number of passengers: " + maxPassengers);
    }
}
