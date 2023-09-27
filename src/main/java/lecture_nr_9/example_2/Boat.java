package lecture_nr_9.example_2;

public class Boat extends Vehicle implements Moveable, Swimmable{

    String boatModel;
    String boatManufacturer;

    public Boat(String serialNumber, Integer engineCount, String boatModel, String boatManufacturer) {
        super(serialNumber, engineCount);
        this.boatModel = boatModel;
        this.boatManufacturer = boatManufacturer;
    }

    @Override
    public void fillFuel() {
        System.out.println(boatModel + " is being filled up with fuel...");
    }

    @Override
    public void move() {
        System.out.println("Boat is moving to the seashore...");
    }

    @Override
    public void swim() {
        System.out.println("Boat is swimming...");
    }
}
