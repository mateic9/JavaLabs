public class Truck extends Vehicle {
    private int capacity;

    Truck(String brand, String model, String depot, int capacity) {
        super(brand, model, depot);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String printInfo = "Truck ";
        printInfo += super.toString();
        printInfo += " " + capacity;
        return printInfo;
    }

}
