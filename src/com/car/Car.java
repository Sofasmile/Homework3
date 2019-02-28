package car;

public class Car {
    private final String date;
    private String typeEngine;
    private int maxSpeed;
    private double accelerationTime;
    private int passengerCount;
    private int passengerNow;
    private int speedNow;
    private CarDoor[] carDoors;
    private CarWheel[] carWheels;

    public Car(String date) {
        this.date = date;
    }

    public Car(String date, String typeEngine, int maxSpeed, double accelerationTime, int passengerCount, int passengerNow, int speedNow) {
        this.date = date;
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCount = passengerCount;
        this.passengerNow = passengerNow;
        this.speedNow = speedNow;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAccelerationTime(double accelerationTime) {
        this.accelerationTime = accelerationTime;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setPassengerNow(int passengerNow) {
        this.passengerNow = passengerNow;
    }

    public void setSpeedNow(int speedNow) {
        this.speedNow = speedNow;
    }

    public int getPassengerNow() {
        return passengerNow;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getDate() {
        return date;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public double getAccelerationTime() {
        return accelerationTime;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public int getSpeedNow() {
        return speedNow;
    }

    public CarWheel getWheel(int i) {
        return carWheels[i];
    }

    public CarDoor getDoor(int i) {
        return carDoors[i];
    }

    public void chandeNowSpeed(int newSpeed) {
        setSpeedNow(newSpeed);
    }

    public void addOnePassenger() {
        this.passengerNow++;
    }

    public void removeOnePassenger() {
        this.passengerNow--;
    }

    public void removeAllPassenger() {
        this.passengerNow = 0;
    }

    public void removeAllWheel() {
        for (CarWheel wheel : carWheels) {
            wheel = null;
        }
    }

    public void addWheel(int x) {

    }

    public double maxNowSpeed() {
        return (getPassengerNow() == 0) ? 0 : getMaxSpeed() * erasedWheel();
    }

    private double erasedWheel() {
        double min = carWheels[0].getBusIntegrity();
        for (CarWheel wheel : carWheels) {
            if (wheel.getBusIntegrity() < min) {
                min = wheel.getBusIntegrity();
            }
        }
        return min;
    }

    public void show() {
        System.out.println("Date of produce: " + getDate()
                + "Type of engine: " + getTypeEngine()
                + "Max speed new car: " + getMaxSpeed()
                + "Acceleration time to 100km/h: " + getAccelerationTime()
                + "Max count of passengers: " + getPassengerCount()
                + "Count of people at the moment: " + getPassengerNow()
                + "Speed at the moment: " + getSpeedNow()
                + "Max speed at the moment: " + maxNowSpeed());
    }
}
