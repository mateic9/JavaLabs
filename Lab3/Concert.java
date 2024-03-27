/**
 * To be honest, yeah, the javadoc was a bit inspired,I am sorry.
 * Based on the fact that
 * since the first homework(L1 smth with matrixes)
 * it was always supposed that my code was not mine and I was the only one
 * suspected of that, what good to tell you the truth?
 * 
 * 
 * 
 * 
 * 
 * This class represents a concert, which is a type of attraction with an
 * associated entry fee.
 * It extends the `Attraction` class and implements the `Payable` interface,
 * providing methods to manage the concert's entry fee.
 */
public class Concert extends Attraction implements Payable {

    /**
     * The price of the entry fee for the concert.
     */
    private double price;

    /**
     * Constructor to create a new `Concert` object.
     * 
     * @param concertName The name of the concert.
     * @param cityName    The city where the concert is held.
     */
    public Concert(String concertName, String cityName) {
        super(concertName, cityName);
    }

    /**
     * Sets the price of the entry fee for the concert.
     * 
     * @param amount The entry fee amount in double format (e.g., 25.50).
     */
    public void setPrice(double amount) {
        price = amount;
    }

    /**
     * Retrieves the current price of the entry fee for the concert.
     * 
     * @return The entry fee amount as a double value.
     */
    public double getPrice() {
        return price;
    }
}
