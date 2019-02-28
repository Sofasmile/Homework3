import car.Car;
import car.CarDoor;
import car.CarWheel;

import javax.swing.text.html.CSS;

public class Program {
    public static void main(String[] args) {
        //CarDoor
        CarDoor carDoor1 = new CarDoor();
        CarDoor carDoor2 = new CarDoor(true, true);
        System.out.println(">>Before changing: ");
        carDoor1.show();
        carDoor2.show();

        carDoor1.openCloseDoor();
        carDoor2.closeDoor();
        carDoor2.closeWindow();
        System.out.println(">>After changing: ");
        carDoor1.show();
        carDoor2.show();
        System.out.println("-----------------------");

        //CarWhell
        CarWheel carWheel1 = new CarWheel();
        CarWheel carWheel2 = new CarWheel(0.5);
        CarWheel carWheel3 = new CarWheel(0.8);
        System.out.println(">>Before changing: ");
        carWheel1.show();
        carWheel2.show();
        carWheel3.show();

        carWheel1.wipeBus(50);
        carWheel2.changeBus();
        carWheel3.wipeBus(200);
        System.out.println(">>After changing: ");
        carWheel1.show();
        carWheel2.show();
        carWheel3.show();
        System.out.println("-----------------------");

        //Car
        Car car = new Car("12.12.2012", "TP-123", 260, 2.5, 6, 2, 100);
        System.out.println(">>Before changing: ");
        car.show();

        car.changeWhell(2, 0.8);
        car.changeDoorAndWindow(2,true,false);
        car.changeCurrentSpeed(150);
        car.addOnePassenger();
        car.removeOnePassenger();
        car.addNewWheel(2);
        System.out.println(">>After changing: ");
        car.show();

    }
}
