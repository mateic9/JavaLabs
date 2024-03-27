public class Client {
    private String nameClient;
    String timeInterval;
    TypeOfClient typeClient;

    public enum TypeOfClient {
        REGULAR,
        PREMIUM
    }

    public Client(String name, TypeOfClient type, String interval) {
        this.nameClient = name;
        this.timeInterval = interval;
        this.typeClient = type;
    }

    public boolean equals(Object x) {
        if (x == null)
            return false;
        if (!(x instanceof Client))
            return false;
        else {
            Client x2 = (Client) x;
            return (x2.nameClient == this.nameClient);
        }

    }

    public String getNameClient() {
        return nameClient;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public TypeOfClient getTypeClient() {
        return typeClient;
    }

    public void setNameClient(String name) {
        this.nameClient = name;
    }

    public void setTypeClient(TypeOfClient type) {
        this.typeClient = type;
    }

    public void setTimeInterval(String interval) {
        this.timeInterval = interval;
    }

    public void print() {
        System.out.println("The name of the client is: " + nameClient);
        System.out.println("Client type: " + typeClient);
        System.out.println("Visiting Time Interval: " + timeInterval);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @param x
     * @return
     */

}