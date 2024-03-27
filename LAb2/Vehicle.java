public abstract class Vehicle {
    private String brandVehicle;
    private String vehicleDepot;
    private int idVehicle;
    static private int nrVehiclesList = 0;
    static private int nrLastId = 0;
    static private int nrDepot = 0;
    private String modelVehicle;
    private static Vehicle[] vehicleList = new Vehicle[100];
    private static Depot[] depotList = new Depot[100];

    public Vehicle(String brand, String model, String depot) {
        this.brandVehicle = brand;
        this.modelVehicle = model;
        this.vehicleDepot = depot;
        this.idVehicle = nrLastId++;
    }

    /*
     * method to add vehicles alreasy created to the List
     */
    public static void addVehicle(Object obj) {

        /// checking if the type of obj corresponds
        if (obj == null)
            throw new ArithmeticException("Null address!");

        if (!(obj instanceof Vehicle))
            throw new ArithmeticException("Incorrect type!");

        if (nrVehiclesList == 0) {
            /// the case the vehicleList was Empty

            Depot depotAux = findDepot(((Vehicle) obj).getCarDepot());

            /// checking if the depot exists, otherwise we throw error
            if (depotAux == null)
                throw new ArithmeticException("Depot not found");

            initVehicle(obj);
            depotAux.addVehicle((Vehicle) obj);
        } else {
            int i, j;
            for (i = 0; i < nrVehiclesList; i++)
                if (((Vehicle) obj).equals(vehicleList[i]) == true)
                    throw new ArithmeticException("Vehicle added previously");

            /// checking if the depot exists, otherwise we throw error
            Depot depotAux = findDepot(((Vehicle) obj).getCarDepot());

            if (depotAux == null)
                throw new ArithmeticException("Depot not found");

            initVehicle(obj);
            depotAux.addVehicle((Vehicle) obj);

        }

    }

    static void initVehicle(Object obj) {
        vehicleList[nrVehiclesList++] = (Vehicle) obj;
        System.out.println("Vehiculul " + ((Vehicle) obj).getBrandVehicle() + " "
                + ((Vehicle) obj).getModelVehicle() + " was succesfully added");
    }

    public String getBrandVehicle() {
        return brandVehicle;
    }

    public Vehicle[] getAllVehicles() {
        return vehicleList;
    }

    public String getModelVehicle() {
        return modelVehicle;
    }

    public String getCarDepot() {
        return vehicleDepot;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public void setBrandVehicle(String brand) {
        this.brandVehicle = brand;
    }

    public void setModelVehicle(String model) {
        this.modelVehicle = model;
    }

    public void setCarDepot(String depot) {
        this.vehicleDepot = depot;
    }

    public void setIdVehicle(int id) {
        this.idVehicle = id;
    }

    public static int getNumberVehicles() {
        return nrVehiclesList;
    }

    /*
     * compare if two Vehicles are the same(same brand,same model)
     */
    public boolean equals(Object x) {
        if (x == null)
            return false;
        if (!(x instanceof Vehicle))
            return false;
        else {
            Vehicle x2 = (Vehicle) x;

            return (x2.brandVehicle == this.brandVehicle && x2.modelVehicle == this.modelVehicle);
        }

    }

    public String toString() {
        String print = this.getBrandVehicle();
        print += " " + this.getModelVehicle();
        print += " " + this.getIdVehicle();
        print += " " + this.getCarDepot();
        return print;
    }

    static public Vehicle[] getVehicles() {
        return vehicleList;
    }

    static public void addDepot(Depot obj) {
        depotList[nrDepot++] = obj;
    }

    static public int getNumberTotalDepots() {
        return nrDepot;
    }

    public static Depot findDepot(String nameDepot) {
        int i;
        for (i = 0; i < nrDepot; i++) {
            if (depotList[i].getNameDepot() == nameDepot)
                return depotList[i];
        }
        return null;
    }
}