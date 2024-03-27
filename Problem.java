

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
/**
 * This class manages the input of the problem
 * I mean the given list passangers and drivers
 */

public class Problem {



    private List<Human> allHumans = new LinkedList<>();

    /**
     * A TreeSet containing passengers sorted alphabetically
     */
    private TreeSet<Human> allPassengers = new TreeSet<>();

    /**
     * A list containing drivers
     */
    private List<Human> allDrivers = new LinkedList<>();

    /**
     * Retrieves the number of humans currently stored
     */
    public int getNrHumans() {
        return allHumans.size();
    }

    /**
     * Adds a human to the collection
     * Adds to passanger or Driver list
     * dpends on what he is
     */
    public void addHuman(Human h) {
        allHumans.add(h);
        if (h instanceof Driver) {
            addDriver(h);
        } else if (h instanceof Passanger) {
            addPassenger(h);
        }
    }

    /**
     * Adds a passenger to the allPassengers TreeSet
     */
    public void addPassenger(Human p) {
        allPassengers.add(p);
    }

    /**
     * Adds a driver to the `allDrivers` list.
     */
    public void addDriver(Human d1) {
        allDrivers.add(d1);
    }

    /**
     * Sorts the drivers in the `allDrivers` list based on their ages
     */
    public void showDrivers() {
        allDrivers.sort(Human::compare_to);  // Sort drivers by age
        for (Human d1 : allDrivers) {
            System.out.println(d1);
        }
    }

    /**
     * Prints all passengers in the `allPassengers` TreeSet to the console.
     */
    public void showPassenger() {
        for (Human p1 : allPassengers) {
            System.out.println(p1);
        }
    }

    /**
     * Filters drivers from the `allHumans` list using a Stream and prints them to the console.
     */
    public void getFilterDrivers() {
        allHumans.stream().filter(e -> e instanceof Driver).forEach(System.out::println);
    }

    /**
     * Filters passengers from the `allHumans` list using a Stream and prints them to the console.
     */
    public void getFilterPassanger() {
        allHumans.stream().filter(e -> e instanceof Passanger).forEach(System.out::println);
    }
    public List <Human> getAllHumans()
    {
        return allHumans;
    }
    public List <Human> getAllDrivers()
    {
        return allDrivers;
    }
    public TreeSet<Human> getAllPassangers()
    {
        return allPassengers;
    }


}
