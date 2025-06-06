package Activities;

public class Bicycle implements BicycleParts, BicycleOperations {
    int gears;
    int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Brake applied. Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Sped up. Current speed: " + currentSpeed);
    }

    public String bicycleDesc() {
        return "No of gears are " + gears + "\nSpeed of bicycle is " + maxSpeed;
    }
}
