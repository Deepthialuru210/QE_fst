package Activities;

public class Activity6 {
    public static void main(String[] args) {
        // Create Plane object with maxPassengers = 10
        plane plane = new plane(10);

        // Onboard passengers
        plane.onboard("Rishi");
        plane.onboard("Nivas");
        plane.onboard("deepthi");

        // Take off
        System.out.println("Takeoff time: " + plane.takeOff());

        // Print passengers list
        System.out.println("Passengers on board: " + plane.getPassengers());

        // Simulate flight duration
        try {
            Thread.sleep(5000); // 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
    }
}

