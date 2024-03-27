import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

/**
 * This interface defines the behavior of attractions that have a schedule and
 * can be visited.
 */
public interface Visitable {

    public Schedule getSchedule();

    default LocalTime getOpeningHoursForSpecificDate(LocalDate specificDate) {
        return getSchedule().getTimeInterval(specificDate).getValue();
    }

    /**
     * Prints the attraction's schedule to the console.
     */
    void printSchedule();

    /**
     * Compares this visitable attraction to another one based on their opening
     */
    default public int compareTo2(Visitable other) {
        LocalTime t1 = this.getOpeningHoursForSpecificDate(LocalDate.now());
        LocalTime t2 = other.getOpeningHoursForSpecificDate(LocalDate.now());

        return t1.compareTo(t2);
    }
}
