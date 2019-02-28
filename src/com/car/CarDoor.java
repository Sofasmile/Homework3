package car;

public class CarDoor {
    private boolean doorCondition;
    private boolean windowСondition;

    public CarDoor() {
        this.doorCondition = false;
        this.windowСondition = false;
    }

    public CarDoor(boolean doorCondition, boolean windowСondition) {
        setDoorCondition(doorCondition);
        setDoorCondition(windowСondition);
    }

    public void setDoorCondition(boolean doorCondition) {
        this.doorCondition = doorCondition;
    }

    public void setWindowСondition(boolean windowСondition) {
        this.windowСondition = windowСondition;
    }

    public boolean getDoorCondition() {
        return doorCondition;
    }

    public boolean getWindowСondition() {
        return windowСondition;
    }

    public void openDoor() {
        setDoorCondition(true);
    }

    public void closeDoor() {
        setDoorCondition(false);
    }

    public void openWindow() {
        setWindowСondition(true);

    }

    public void closeWindow() {
        setWindowСondition(false);

    }

    public void openCloseDoor() {
        setDoorCondition(getDoorCondition() == true ? false : true);
    }

    public void openCloseWindow() {
        setWindowСondition(getWindowСondition() == true ? false : true);
    }

    public void show() {
        String stateOfDoor = (getDoorCondition() == true ? "open" : "close");
        String stateOfWindow = (getWindowСondition() == true ? "open" : "close");
        System.out.println("The door is " + stateOfDoor
                + "The window is " + stateOfWindow);
    }
}
