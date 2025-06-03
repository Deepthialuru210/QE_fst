package Activities;

public class Activity1 {
    public static void main(String[] args) {
        // Create object of Car
        Car maruthi = new Car();

        // values
        maruthi.make = 2014;
        maruthi.color = "Black";
        maruthi.transmission = "Manual";

        // methods
        maruthi.displayCharacteristics();
        maruthi.accelerate();
        maruthi.brake();
    }
}