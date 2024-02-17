package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Create Ship array of size 3
        Ship[] shipTypes = new Ship[3];

        // Initialize different ships within the Ship array
        shipTypes[0] = new Ship("Base Ship", "2020");
        shipTypes[1] = new CruiseShip("Cruise Ship", "2021", 5000);
        shipTypes[2] = new CargoShip("Cargo Ship", "2022", 6000);

        // Print ships
        for (Ship ship: shipTypes) {
            ship.printInfo();
            System.out.println();
        }
    }
}
