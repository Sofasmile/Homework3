package car;

public class CarWheel {
    private double busIntegrity;
    private static final int OLD_BAS = 0;
    private static final int NEW_BAS = 1;

    public CarWheel() {
        busIntegrity = NEW_BAS;
    }

    public CarWheel(double busIntegrity) {
        setBusIntegrity(busIntegrity);
    }

    public void setBusIntegrity(double busIntegrity) {
        if (numberInRange(busIntegrity) == true) {
            this.busIntegrity = busIntegrity;
        } else {
            System.out.println("The object can't be create/change.\nThe value goes beyond the permissible limits [0,1]");
        }
    }

    private boolean numberInRange(double value) {
        return (value <= NEW_BAS && value >= OLD_BAS) ? true : false;
    }

    public double getBusIntegrity() {
        return busIntegrity;
    }

    //make new bus
    public void changeBus() {
        busIntegrity = NEW_BAS;
    }

    public void wipeBus(int x) {
        if (x <= 100 && x >= 0) {
            setBusIntegrity(getBusIntegrity() - getBusIntegrity() * x / 100);
        } else {
            System.out.println("The value goes beyond the permissible limits [0,100]");
        }
    }

    public void show() {
        System.out.println("    The state of bus: " + getBusIntegrity());
    }

}
