import java.util.*;

/**
 * This class represents a driver
 */
public class Driver extends Human {

    private List<String> route = new ArrayList<>();
    private List<Boolean> booked = new ArrayList<Boolean>();
    private List<Human> passeangerList = new ArrayList<Human>();




    public Driver(String name1, int age1, String pickupPoint1, String destination1) {
        super(name1, age1, pickupPoint1, destination1);
    }

    /**
     * Compares this driver to another Human object based on their ages.
     */
    @Override
    public int compare_to(Human other) {
        if (this.getAge() > other.getAge()) {
            return 1;
        } else if (this.getAge() < other.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Sets the route for this driver.
     */
    public void addRoute(List<String> paramList) {
        route = paramList;
        initializeBooked();
    }

    /**
     * Sets that the car is booked between cities of index a and b
     */
    public void setBooked(int a, int b) {
        int i;
        for (i = a; i <= b; i++) booked.set(i, true);
    }

    /**
     * Initializes the booked status list for this driver based on the route.
     */
    public void initializeBooked() {
        for (int i = 0; i < route.size(); i++)
            booked.add(false);
    }

    /**
     * Retrieves the route of this driver.
     */
    public List<String> getRoute() {
        return route;
    }

    /**
     * Checks if this driver is available for booking
     * between the specified pickup and destination indices in the route
     */
    public boolean checkAvailable(int indexPickupPoint, int indexDestination) {
        int i;
        for (i = indexPickupPoint; i <= indexDestination; i++)
            if (booked.get(i))
                return false;
        return true;
    }

    /**
     * Assigns a passenger to this driver.
     */
    public void assign(Human h) {
        passeangerList.add(h);
    }

    public boolean getHasADriver() {
        return false;
    }
}
