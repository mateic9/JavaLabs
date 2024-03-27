import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        Trip t = new Trip("Iasi", LocalDate.now(), LocalDate.now());
        Church ch1 = new Church("Sf. Petru", "Iasi");
        Church ch2 = new Church("Sf. Petru2", "Iasi");
        Church ch3 = new Church("Sf. Petru3", "Iasi");
        ch1.setSchedule(LocalDate.now(), LocalTime.of(12, 0), LocalTime.of(13, 0));
        ch2.setSchedule(LocalDate.now(), LocalTime.of(1, 0), LocalTime.of(13, 0));
        ch3.setSchedule(LocalDate.now(), LocalTime.of(2, 0), LocalTime.of(13, 0));
        t.addAttraction(ch1);
        t.addAttraction(ch2);
        t.addAttraction(ch3);
        t.getFreeAttractions(LocalDate.now());

    }
}