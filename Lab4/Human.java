import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This abstract class represents a human being with name, age, pickup point, and destination.
 */
public abstract class Human {

    private String name;
    private int age;
    private String pickupPoint;
    private String destination;

    /**
     * Constructor to initialize a Human object
     *
     * @param name1         the name of the human
     * @param age1          the age of the human
     * @param pickupPoint1  the pickup point of the human
     * @param destination1  the destination of the human
     */
    public Human(String name1, int age1, String pickupPoint1, String destination1) {
        age = age1;
        name = name1;
        pickupPoint = pickupPoint1;
        destination = destination1;
    }


    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }


    public String getDestination() {
        return destination;
    }


    public String getPickupPoint() {
        return pickupPoint;
    }


    @Override
    public String toString() {
        return this.getName() + " from " + this.pickupPoint + " to " + this.getDestination() + " " + getAge();
    }


    public abstract int compare_to(Human other);

    /**
     * Abstract method to get the route of the human
     */
    public abstract List<String> getRoute();

    /*
      Abstract method to check the availability of booking for the human.

     */
    public abstract boolean checkAvailable(int a, int b);

    /**
     * Abstract method to set the booked status for the human.
     *
     * @param a the first parameter for setting booked status
     * @param b the second parameter for setting booked status
     */
    public abstract void setBooked(int a, int b);

    /**
     * Abstract method to assign another human to this human.
     *
     * @param h the human to be assigned
     */
    public abstract void assign(Human h);


    public abstract boolean getHasADriver();
}
