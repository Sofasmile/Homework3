package car;

public class CarWheel {
    private double busIntegrity;

    public CarWheel() {
        setBusIntegrity(1);
    }

    public CarWheel(double busIntegrity) {
        this.busIntegrity = busIntegrity;
    }

    public void setBusIntegrity(double busIntegrity) {
        if (busIntegrity >= 0 && busIntegrity <= 1) {
            this.busIntegrity = busIntegrity;
        }
    }

    public double getBusIntegrity() {
        return busIntegrity;
    }

    public void changeBus() {
        setBusIntegrity(1);
    }

    public void wipeOfBus(int x) {
        setBusIntegrity(getBusIntegrity() - getBusIntegrity() * x / 100);
    }

    public void show() {
        System.out.println("The state of bus: " + getBusIntegrity());
    }

}
