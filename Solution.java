import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

 /// nicolae.abacioaiei@gmail.com
/**
 * This class represents a solution for a problem involving instances of Human and Problem classes.
 */
public class Solution {

    private Problem instance;
    List<String> reachableDestination = new ArrayList<String>();
    private List<String> allDestinations = new ArrayList<String>();
    private Map<String, List<Human>> wishedDestination = new HashMap<String, List<Human>>();

    /**
     * Sets the wished destinations based on the instances of Human associated with this Solution.
     */
    public void setWishedDestinations() {
        List<Human> h = this.getInstance().getAllHumans();
        Stream<Human> streamOfHuman = h.stream();
        wishedDestination = streamOfHuman.collect(Collectors.groupingBy(Human::getDestination));
    }

    /**
     * Sets the instance of Problem associated with this Solution.
     *
     * @param p1 the instance of Problem to be set
     */
    public void setInstance(Problem p1) {
        instance = p1;
    }

    /**
     * Retrieves the instance of Problem associated with this Solution.
     *
     * @return the instance of Problem associated with this Solution
     */
    public Problem getInstance() {
        return instance;
    }

    /**
     * Computes and prints reachable destinations based on the current state of the solution.
     */
    public void getReachableDestinations() {
        this.setWishedDestinations();
        reachableDestination = this.getInstance().getAllDrivers().stream().flatMap(e -> e.getRoute().stream()).
                filter(e -> wishedDestination.containsKey(e)).collect(Collectors.toSet()).stream().toList();
        for (String i : reachableDestination.stream().toList())
            System.out.println(i);
    }

    /**
     * Assigns drivers to passengers based on their pickup and destination points.
     */
    void assignDrivers() {

        //for each driver we assign the free passangers who have the shortest distance to be driven

        for (Human driver : this.getInstance().getAllDrivers()) {


            List<String> route = driver.getRoute();
            //asigning the maximum value +1
            int distanta = driver.getRoute().size() + 1;
            Human passangerToAssign = null;

            for (Human passanger : this.getInstance().getAllPassangers()) {
                if (!passanger.getHasADriver()) {

                    int indexPickupPoint = route.indexOf(passanger.getPickupPoint());
                    int indexDestination = route.indexOf(passanger.getDestination());

                    // if the driver route fits with the passanger route
                    if (indexDestination > -1 && indexPickupPoint > -1 && indexDestination > indexPickupPoint) {
                        if (driver.checkAvailable(indexPickupPoint, indexDestination) && distanta > (indexDestination - indexPickupPoint + 1)) {
                            passangerToAssign = passanger;
                            distanta = indexDestination - indexPickupPoint + 1;
                        }
                    }
                }
            }


            if (distanta != (driver.getRoute().size() + 1)) {
                driver.setBooked(route.indexOf(passangerToAssign.getPickupPoint()), route.indexOf(passangerToAssign.getDestination()));
                passangerToAssign.assign(driver);
            }
        }
    }
}
