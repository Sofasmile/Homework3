package car;

public class CarDoor {
    private boolean isDoorOpened;
    private boolean isWindowOpened;

    public CarDoor() {
    }

    public CarDoor(boolean doorCondition, boolean windowСondition) {
        this.isDoorOpened = doorCondition;
        this.isWindowOpened = windowСondition;
    }

    public void setDoorCondition(boolean doorCondition) {
        this.isDoorOpened = doorCondition;
    }

    public void setWindowСondition(boolean windowСondition) {
        this.isWindowOpened = windowСondition;
    }

    public boolean getDoorCondition() {
        return isDoorOpened;
    }

    public boolean getWindowСondition() {
        return isWindowOpened;
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
        System.out.println("    The door is " + stateOfDoor
                + ". The window is " + stateOfWindow);
    }
}
