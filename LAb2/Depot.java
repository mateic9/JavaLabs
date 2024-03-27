import java.util.Arrays;

public class Depot {
    private String nameDepot;
    private int nrVehicles = 0;
    private static int nrDepot = 0;
    private static Depot[] depotList = new Depot[100];
    private Vehicle[] vehicleList = new Vehicle[100];

    public Depot(String name) {

        this.nameDepot = name;

    }

    public void addVehicle(Vehicle obj) {
        vehicleList[nrVehicles++] = obj;

    }

    static void initDepot(Object obj) {
        depotList[nrDepot++] = (Depot) obj;
        System.out.println("Vehiculul " + ((Depot) obj).getNameDepot() + " was succesfully added");

        /// adding the new depot in the depotlist from vehicle
        Vehicle.addDepot((Depot) obj);

    }

    public static void addDepot(Object obj) {
        if (obj == null)
            throw new ArithmeticException("Null address!");

        if (!(obj instanceof Depot))
            throw new ArithmeticException("Incorrect type!");

        if (nrDepot == 0)
            initDepot(obj);
        else {
            int i;
            for (i = 0; i < nrDepot; i++)
                if (((Depot) obj).equals(depotList[i]) == true)
                    break;

            if (i == nrDepot) {
                initDepot(obj);
            }

        }
    }

    public String getNameDepot() {
        return nameDepot;
    }

    public int getNrVehicles() {
        return nrVehicles;
    }

    public void printCars() {
        int i;
        for (i = 0; i < nrVehicles; i++)
            System.out.println(vehicleList[i]);

    }

    public void setNameDepot(String name) {
        this.nameDepot = name;
    }

    public void setNumberVehicle(int nr) {
        this.nrVehicles = nr;
    }

    public String toString() {
        String printInfo = "Depot " + this.getNameDepot();
        printInfo += "has " + this.getNrVehicles() + " vehicles";
        return printInfo;

    }

    /*
     * checking if two depots are equal
     */
    public boolean equals(Object x) {
        if (x == null)
            return false;
        if (!(x instanceof Depot))
            return false;
        else {
            Depot x2 = (Depot) x;
            return (x2.nameDepot == this.nameDepot);
        }

    }

    public static int getNumberTotalDepots() {
        return nrDepot;
    }

}