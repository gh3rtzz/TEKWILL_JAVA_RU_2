package lecture_nr_9.example_2;

public class Car extends Vehicle implements Moveable{

    String wheelSize;
    String carModel;
    String carManufacturer;

    public Car(String serialNumber, Integer engineCount, String wheelSize, String carModel, String carManufacturer) {
        super(serialNumber, engineCount);
        this.wheelSize = wheelSize;
        this.carModel = carModel;
        this.carManufacturer = carManufacturer;
    }

    @Override
    public void move() {
        System.out.println("Car is driving...");
    }
}
