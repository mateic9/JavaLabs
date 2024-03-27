import java.util.List;
import java.util.Set;

/**
 * This class represents a passenger, extending the `Human` class
 */
public class Passanger extends Human implements Comparable<Passanger> {

    private boolean hasADriver=false;
    public Passanger(String name1, int age1,String pickupPoint1, String destination) {
        super(name1, age1,pickupPoint1 , destination);
    }

    /**
     * Compares this passenger to another `Human` object based on their names,
     */
    @Override
    public int compare_to(Human other) {
        return this.getName().compareTo(other.getName());
    }

    /**
     * Compares this passenger to another one object based on their names,
     */
    @Override
    public int compareTo(Passanger other) {
        return this.getName().compareTo(other.getName());
    }

    public List<String> getRoute() {
        return null;
    };
    public boolean checkAvailable(int a,int b)
    {
        return false;
    }
    public  void setBooked(int a,int b){
        int aa;
    }
    public void assign (Human h)
    {
     hasADriver=true;
    }

    public boolean getHasADriver()
    {
        return hasADriver;
    }
}
