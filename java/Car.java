package Activities;
public class Car {
    // Variables
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // default constructor
    public Car() {
        tyres = 4;
        doors = 4;
    }

  // methods to show the car properties
    public void displayCharacteristics() {
        System.out.println("Color of the car: " + color);
        System.out.println("Transmission of the car: " + transmission);
        System.out.println("Make of the car: " + make);
        System.out.println("Number of doors: " + doors);
        System.out.println("Number of tyres: " + tyres);
    }

    // Method to acceleration
    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    // Method to braking
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
