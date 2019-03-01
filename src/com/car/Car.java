package car;

public class Car {
    private final String date;
    private String typeEngine;
    private int maxSpeed;
    private double runUpTime;
    private int maxCountPassenger;
    private int passengerNow;
    private int speedNow;
    private static final int MAX_NUMBER_WHEEL = 10;
    private static final int MAX_NUMBER_DOOR = 4;
    private int countWheel;
    private CarDoor[] carDoors = new CarDoor[MAX_NUMBER_DOOR];
    private CarWheel[] carWheels = new CarWheel[MAX_NUMBER_WHEEL];


    public Car(String date) {
        this.date = date;
        setCarDoor();
        setCarWheels();
    }

    public Car(String date, String typeEngine, int maxSpeed, double runUpTime, int maxCountPassenger, int passengerNow, int speedNow) {
        this.date = date;
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.runUpTime = runUpTime;
        this.maxCountPassenger = maxCountPassenger;
        this.passengerNow = passengerNow;
        this.speedNow = speedNow;
        setCarDoor();
        setCarWheels();
    }

    //filling the array of doors
    public void setCarDoor() {
        for (int i = 0; i < carDoors.length; i++) {
            carDoors[i] = new CarDoor();
        }
    }

    //filling the array of wheels
    public void setCarWheels() {
        countWheel = 4;
        for (int i = 0; i < countWheel; i++) {
            carWheels[i] = new CarWheel();
        }
    }

    //changing whell by index
    public void changeWhell(int index, double busIntegrity) {
        if (countWheel != 0 || index < countWheel) {
            carWheels[index].setBusIntegrity(busIntegrity);
        } else {
            System.out.println("The wheel with this index doesn't exist!");
        }
    }
    //changing door and window by index
    public void changeDoorAndWindow(int index, boolean door, boolean window) {
        if (index < carDoors.length) {
            carDoors[index].setDoorCondition(door);
            carDoors[index].setWindowСondition(window);
        } else {
            System.out.println("The wheel with this index doesn't exist!");
        }
    }

    public String getDate() {
        return date;
    }

    public void setTypeEngine(String typeEngine) {
        this.typeEngine = typeEngine;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setRunUpTime(double accelerationTime) {
        this.runUpTime = accelerationTime;
    }

    public double getRunUpTime() {
        return runUpTime;
    }

    public void setMaxCountPassenger(int passengerCount) {
        this.maxCountPassenger = passengerCount;
    }

    public int getMaxCountPassenger() {
        return maxCountPassenger;
    }

    public void setPassengerNow(int passengerNow) {
        this.passengerNow = passengerNow;
    }

    public int getPassengerNow() {
        return passengerNow;
    }

    public void setSpeedNow(int speedNow) {
        this.speedNow = speedNow;
    }

    public int getSpeedNow() {
        return speedNow;
    }

    //get wheel by index
    public void getWheel(int i) {
        if (i < MAX_NUMBER_WHEEL && i >= 0) {
            if (carWheels[i] != null) {
                carWheels[i].show();
            }
        } else {
            System.out.println("The wheel with this index doesn't exist!");
        }
    }

    //get door by index
    public void getDoor(int i) {
        if (i < MAX_NUMBER_DOOR && i >= 0) {
            if (carDoors[i] != null) {
                carDoors[i].show();
            }
        } else {
            System.out.println("The door with this index doesn't exist!");
        }
    }

    public void changeCurrentSpeed(int newSpeed) {
        if (newSpeed <= maxSpeed && newSpeed >= 0) {
            this.speedNow = newSpeed;
        } else {
            System.out.println("The value of new speed go beyond [0, " + getMaxSpeed() + "]");
        }
    }

    public void addOnePassenger() {
        if (passengerNow < maxCountPassenger) {
            this.passengerNow++;
        } else {
            System.out.println("The car is full!");
        }
    }

    public void removeOnePassenger() {
        if (passengerNow > 0) {
            this.passengerNow--;
        } else {
            System.out.println("There aren't passengers in the car!");
        }
    }

    public void removeAllPassenger() {
        this.passengerNow = 0;
    }

    //add some buses
    public void addNewWheel(int x) {
        if (x > 0 && x + countWheel <= MAX_NUMBER_WHEEL) {
            for (int i = countWheel; i < countWheel + x; i++) {
                carWheels[i] = new CarWheel();
            }
            countWheel += x;
        } else {
            System.out.println("It is impossible to add " + x + " wheels");
        }
    }

    public void removeAllWheel() {
        for (CarWheel wheel : carWheels) {
            wheel = null;
        }
        speedNow = 0;
        countWheel = 0;
    }

    //max speed at the moment
    public double maxNowSpeed() {
        return (getPassengerNow() != 0 && countWheel != 0) ? getMaxSpeed() * erasedWheel() : 0;
    }

    //search the worst bus
    private double erasedWheel() {
        double min = carWheels[0].getBusIntegrity();
        for (int i = 0; i < countWheel; i++) {
            if (carWheels[i].getBusIntegrity() < min) {
                min = carWheels[i].getBusIntegrity();
            }
        }
        return min;
    }

    public void show() {
        System.out.println("Date of produce: " + getDate()
                + "\nType of engine: " + getTypeEngine()
                + "\nMax speed new car: " + getMaxSpeed()
                + "\nAcceleration time to 100km/h: " + getRunUpTime()
                + "\nMax count of passengers: " + getMaxCountPassenger()
                + "\nCount of people at the moment: " + getPassengerNow()
                + "\nSpeed at the moment: " + getSpeedNow()
                + "\nMax speed at the moment: " + maxNowSpeed()
                + "\nNumber of whell:  " + countWheel
                + ". \nInformation about whells: ");
        for (int i = 0; i < countWheel; i++) {
            carWheels[i].show();
        }
        System.out.println("Information about doors: ");
        for (CarDoor door : carDoors) {
            if (door != null) {
                door.show();
            }
        }
    }
}
