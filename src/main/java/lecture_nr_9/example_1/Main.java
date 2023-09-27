package lecture_nr_9.example_1;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.drive();
    }
}

class Car implements Drivable{

    String carManufacturer;
    String carModel;

    @Override
    public void drive() {
        System.out.println("Car is driving");
        Drivable.makeSound();
    }
}

class Truck implements Drivable{
    @Override
    public void drive() {
        System.out.println("Truck is driving!");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Printing from another method from Truck class");
    }
}

interface Drivable{
    String SOMETHING = "aasd";
    void drive();
    static void makeSound(){
        System.out.println("Making a movable vehicle sound!");
    }

    default void anotherMethod(){
        System.out.println("Printing from another method");
    }
}


