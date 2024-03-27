import java.util.*;

public class Main {
    static public void main(String[] args) {
        Drone D1 = new Drone("BMW", "M2", "Depot1", 23);
        Drone D2 = new Drone("BMW", "J2", "Depot1", 23);
        Drone D3 = new Drone("BMW", "J5", "Depot1", 23);
        Truck T1 = new Truck("BMWtr", "M2", "Depot1", 21);
        Depot Dep1 = new Depot("Depot1");
        Depot Dep2 = new Depot("Dep2");
        Depot.addDepot(Dep1);
        Depot.addDepot(Dep2);
        Vehicle.addVehicle(D2);
        Vehicle.addVehicle(D1);
        Vehicle.addVehicle(D3);
        Vehicle.addVehicle(T1);
        System.out.println(Dep1.getNrVehicles());
    }
}
