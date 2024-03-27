import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * To be honest, yeah, the javadoc was a bit inspired.Based on the fact that
 * since the first homework(L1 smth with matrixes)
 * it was always supposed that my code was not mine and I was the only one
 * suspected of that, what good to recognise the truth?
 * 
 * 
 * 
 * 
 * This class represents a church, which is a type of attraction with a specific
 * schedule.
 * It extends the `Attraction` class and implements the `Visitable` interface,
 * providing additional functionality for managing a church's opening hours and
 * schedule.
 */
public class Church extends Attraction implements Visitable {

    /**
     * The church's schedule, containing opening hours for different days.
     */
    private Schedule schedule = new Schedule();

    /**
     * Constructor to create a new `Church` object.
     * 
     * @param churchName The name of the church.
     * @param cityName   The city where the church is located.
     */
    public Church(String churchName, String cityName) {
        super(churchName, cityName);
    }

    /**
     * Sets the opening hours for a specific date in the church's schedule.
     * 
     * @param calendarDate The date for which to set the opening hours.
     * @param beginHour    The beginning time of the opening hours.
     * @param lastHour     The closing time of the opening hours.
     */
    public void setSchedule(LocalDate calendarDate, LocalTime beginHour, LocalTime lastHour) {
        schedule.addDaySchedule(calendarDate, beginHour, lastHour);
    }

    /**
     * Retrieves the church's schedule.
     * 
     * @return The church's schedule object.
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * Prints the church's schedule to the console.
     */
    public void printSchedule() {
        schedule.printSchedule();
    }

    /**
     * Overrides the `toString()` method to provide a concise string representation
     * of the church.
     * 
     * @return A string containing the church name and city name.
     */
    @Override
    public String toString() {
        String printInfo = this.getAttractionName() + " " + this.getCityName();
        return printInfo;
    }

    /**
     * Compares this church to another `Visitable` object based on their opening
     * hours for the current date.
     * 
     * @param obj The other `Visitable` object to compare with.
     * @return A positive value if this church's opening hours start later than the
     *         other object's,
     *         a negative value if they start earlier, or 0 if they start at the
     *         same time.
     */
    @Override
    public int compareTo2(Visitable obj) {
        return this.getOpeningHoursForSpecificDate(LocalDate.now())
                .compareTo(obj.getOpeningHoursForSpecificDate(LocalDate.now()));
    }

}
