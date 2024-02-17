package Polymorphism;

public class CargoShip extends Ship{
    private int cargoCapacity;
    
    // Cargo Ship Constructor
    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Getters
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Setters
    public void setCargoCapacity(int newCargoCapacity) {
        this.cargoCapacity = newCargoCapacity;
    }

    // Override print function
    @Override
    public void printInfo() {
        System.out.println("Ship name: " + getName() + "\nShip cargo capacity: " + cargoCapacity);
    }
}
