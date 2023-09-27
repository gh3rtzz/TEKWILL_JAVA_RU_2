package lecture_nr_9.example_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car BMW = new Car("111111", 1, "245/35/R18", "M4", "BMW");
        Car Audi = new Car("111112", 1, "190/60/R16", "A4", "Audi");

        Plane Boeing = new Plane("222222", 2, "747 Max", "Boeing");
        Plane Airbus = new Plane("222223", 2, "A328 Neo", "Airbus");

        Boat Bayliner = new Boat("333333", 4, "Avanti", "Bayliner");
        Boat GradyWhite = new Boat("333334", 2, "Maximus", "GradyWhite");

        makeVehicleSwim(GradyWhite);
        takeOffAllFlyableObjects(Boeing);

        fillVehicleWithFuel(Boeing);
        fillVehicleWithFuel(Bayliner);

        stopMovableObject(BMW);
        stopMovableObject(Airbus);

        List<Moveable> movableList = List.of(BMW, Audi, Boeing, Airbus, Bayliner, GradyWhite);

        System.out.println("------------------");
        moveAllMovableObjects(movableList);



    }

    public static void moveAllMovableObjects(List<Moveable> inputMovableList){
        for (Moveable element :
                inputMovableList) {
            element.move();
        }
    }

    //Will call swim() from object in parameters
    //makeVehiclesSwim



    public static void makeVehicleSwim(Swimmable inputSwimmable){
        inputSwimmable.swim();
        Boat tempBoat = (Boat) inputSwimmable;

        System.out.println("Boat that is swimming is: " + tempBoat.boatModel);
    }

    //takeOffAllFlyableObjects
    //will call takeOff from object in parameters
    public static void takeOffAllFlyableObjects(Flyable inputFlyable){
        inputFlyable.takeOff();
    }

    public static void fillVehicleWithFuel(Vehicle inputVehicle){
        inputVehicle.fillFuel();
    }

    public static void stopMovableObject(Moveable inputMovable){
        inputMovable.stop();
    }



}
