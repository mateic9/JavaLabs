import java.util.*;

public class Statue extends Attraction implements Payable {
    private double price;

    Statue(String concert, String cityName) {
        super(concert, cityName);

    }

    public void setPrice(double amount) {
        price = amount;
    }

    public double getPrice() {
        return price;
    }

}
