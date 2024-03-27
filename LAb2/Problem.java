public class Problem {
    public Vehicle[] getVehicles() {
        Vehicle a = new Drone("randomName", "randomModel", "randomDepot", 123);
        return a.getAllVehicles();

    }

    static public void main(String[] args) {
        Problem p = new Problem();
        Vehicle[] v = p.getVehicles();
        Drone D1 = new Drone("Audi", "A5", "D1", 56);
        Vehicle.addVehicle(D1);
        System.out.println(v[0]);
    }

}
