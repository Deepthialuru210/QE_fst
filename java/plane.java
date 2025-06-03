package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to onboard a passenger
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full! Cannot onboard more passengers.");
        }
    }

    // Method to simulate takeoff
    public Date takeOff() {
        this.lastTimeTookOff = new Date();
        return this.lastTimeTookOff;
    }

    // Method to simulate landing
    public void land() {
        this.lastTimeLanded = new Date();
        passengers.clear();
    }

    // Getter for lastTimeLanded
    public Date getLastTimeLanded() {
        return this.lastTimeLanded;
    }

    // Getter for passengers list
    public List<String> getPassengers() {
        return this.passengers;
    }
}
