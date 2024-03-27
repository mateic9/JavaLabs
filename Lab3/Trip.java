import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class represents a trip to a specific city, containing information about
 * the travel dates and a list of attractions to visit.
 */
public class Trip {

    /**
     * The name of the city the trip is planned for
     */
    private String cityName;

    /**
     * The statring date of the trip.
     */
    private LocalDate startDay;

    /**
     * The ending date of the trip
     */
    private LocalDate finishDay;

    /**
     * A list of attractions planned for the trip.
     */
    private List<Attraction> attractionList = new ArrayList<>();

    /**
     * Consturctor to create a new Trip object.
     * 
     * @param cityName The name of the city for the trip.
     * @param start    The starting date of the trip.
     * @param finish   The ending date of the trip.
     */
    public Trip(String cityName, LocalDate start, LocalDate finish) {
        this.cityName = cityName;
        this.startDay = start;
        this.finishDay = finish;
    }

    /**
     * Adds an attraction to the trip plan, ensuring it belongs to the planned city.
     * 
     * @param attraction The attraction to be added.
     */
    public void addAttraction(Attraction attraction) {
        if (!attraction.getCityName().equals(cityName)) {
            System.out.println(attraction.getAttractionName() + " from " + attraction.getCityName() + " is not in city "
                    + cityName);
        } else {
            attractionList.add(attraction);
        }
        // Sort attractions in alphabetical order after adding
        Collections.sort(attractionList);
    }

    /**
     * Prints all attractions in the trip plan.
     */
    public void showAllAttractions() {
        for (Attraction attraction : attractionList) {
            System.out.println(attraction);
        }
    }

    /**
     * Filters and displays all free attractions
     */
    public void getFreeAttractions(LocalDate specificDate) {
        List<Visitable> freeAttractions = attractionList.stream()
                .filter(att -> att instanceof Visitable && !(att instanceof Payable))
                .map(att -> (Visitable) att)
                .collect(Collectors.toList());

        freeAttractions.sort(Visitable::compareTo2); // Sort by opening hours on the specified date
        for (Visitable attraction : freeAttractions) {
            System.out.println(attraction);
        }
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public LocalDate getFinishDay() {
        return finishDay;
    }
}
