
public class Drone extends Vehicle {
    private double flightDuration;

    public Drone(String brand, String model, String depot, float duration) {
        super(brand, model, depot);
        this.flightDuration = duration;

    }

    @Override
    public String toString() {
        String printInfo = "Drone ";
        printInfo += super.toString();
        printInfo += " " + flightDuration;
        return printInfo;
    }
}
