import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

/**
 * This class represents a schedule, which holds a collection of dates and their
 * corresponding time intervals.
 * It allows for storing and retrieving opening hours or other time-based
 * events.
 */
public class Schedule {

    /**
     * A temporary pair object used to store a time interval before adding it to the
     * calendar.
     */
    private Pair<LocalTime, LocalTime> timeInterval = new Pair<LocalTime, LocalTime>(null, null);

    /**
     * The calendar, represented as a map where keys are dates and values are their
     * corresponding time intervals.
     */
    private Map<LocalDate, Pair<LocalTime, LocalTime>> calendar = new HashMap<>();

    /**
     * Adds a time interval to the schedule for a specific date.
     * 
     * @param calendarDate The date for which to add the time interval.
     * @param beginHour    The starting time of the time interval.
     * @param lastHour     The ending time of the time interval.
     */
    public void addDaySchedule(LocalDate calendarDate, LocalTime beginHour, LocalTime lastHour) {
        timeInterval.setKey(beginHour);
        timeInterval.setValue(lastHour);
        calendar.put(calendarDate, timeInterval);
    }

    /**
     * Retrieves the entire calendar map.
     * 
     * @return The map containing all dates and their associated time intervals.
     */
    public Map<LocalDate, Pair<LocalTime, LocalTime>> getCalendar() {
        return calendar;
    }

    /**
     * Retrieves the time interval for a specific date from the schedule.
     * 
     * @param specifiedDate The date for which to retrieve the time interval.
     * @return The `Pair` object containing the start and end times for the
     *         specified date,
     *         or null if no time interval is set for that date.
     */
    public Pair<LocalTime, LocalTime> getTimeInterval(LocalDate specifiedDate) {
        return calendar.get(specifiedDate);
    }

    /**
     * Prints the schedule to the console, showing each date and its corresponding
     * time interval.
     */
    public void printSchedule() {
        for (Map.Entry<LocalDate, Pair<LocalTime, LocalTime>> iterator : calendar.entrySet()) {
            String key1 = iterator.getKey().toString();
            String value1Key1 = " from " + iterator.getValue().getKey().toString();
            String value1Key2 = " to " + iterator.getValue().getValue().toString();
            System.out.println(key1 + value1Key1 + value1Key2);
        }
    }

    /**
     * Checks if a specific date exists in the schedule.
     * 
     * @param specificDate The date to check for existence.
     * @return The date itself if it exists in the schedule, or null if it doesn't.
     */
    public LocalDate existsKey(LocalDate specificDate) {
        if (this.calendar.get(specificDate) != null)
            return specificDate;
        return null;
    }
}
