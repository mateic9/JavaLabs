/**
 * This class represents an attraction, including its name and the city it's
 * located in.
 * It implements the `Comparable<Attraction>` interface to allow sorting
 * attractions based on name.
 */
public class Attraction implements Comparable<Attraction> {

    /**
     * The name of the attraction.
     */
    private String attractionName;

    /**
     * The city where the attraction is located.
     */
    private String cityName;

    /**
     * Constructor to create a new `Attraction` object.
     * 
     * @param attractionName The name of the attraction.
     * @param cityName       The city where the attraction is located.
     */
    public Attraction(String attractionName, String cityName) {
        this.attractionName = attractionName;
        this.cityName = cityName;
    }

    /**
     * Getter method to retrieve the city name of the attraction.
     * 
     * @return The city name of the attraction.
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Getter method to retrieve the attraction name.
     * 
     * @return The name of the attraction.
     */
    public String getAttractionName() {
        return attractionName;
    }

    /**
     * Overrides the `toString()` method to provide a human-readable representation
     * of the attraction.
     * 
     * @return A string representation of the attraction in the format "Attraction
     *         Name from City Name".
     */
    @Override
    public String toString() {
        return this.getAttractionName() + " from " + this.getCityName();
    }

    /**
     * Overrides the `compareTo()` method from the `Comparable` interface.
     * This method allows sorting attractions based on their names in alphabetical
     * order.
     * 
     * @param other The other `Attraction` object to compare with.
     * @return A positive value if this attraction comes after the other attraction
     *         alphabetically,
     *         a negative value if it comes before, or 0 if they are equal.
     */
    @Override
    public int compareTo(Attraction other) {
        return this.attractionName.compareTo(other.getAttractionName());
    }
}
