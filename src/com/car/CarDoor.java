package car;

public class CarDoor {
    private boolean doorCondition;
    private boolean windowСondition;

    public CarDoor() {
        setDoorCondition(false);
        setWindowСondition(false);
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

}
