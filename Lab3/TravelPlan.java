import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a travel plan.
 */
public class TravelPlan {

    /**
     * The starting date of the travel plan.
     */
    private LocalDate startDay;

    /**
     * The ending date of the travel plan.
     */
    private LocalDate finishDay;

    /**
     * A map that stores attractions and their assigned visiting dates for the trip.
     */
    private Map<Visitable, LocalDate> day = new HashMap<>();

    /**
     * Assigns an attraction to a specific visiting date within the travel plan,
     */
    void assignAttraction(Visitable att) {
        Schedule s = att.getSchedule();

        for (LocalDate it = startDay; it.equals(finishDay); it.plusDays(1)) {
            LocalDate dayOfVisit = s.existsKey(it);

            // Check if the attraction is open on this date
            if (dayOfVisit != null) {
                day.put(att, dayOfVisit); // Assign the attraction to this date
                break;
            }
        }
    }

    /**
     * Sets the start and end dates of the travel plan based on a trip object.
     */
    void addTrip(Trip T) {
        startDay = T.getStartDay();
        finishDay = T.getFinishDay();
    }
}
