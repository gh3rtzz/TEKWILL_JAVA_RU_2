package lecture_nr_6.inheritance;

public class Car extends Vehicle{

    String carManufacturer;
    String carModel;

    public Car(int nrOfSeats, int freightWeight, String color, String VIN, String carManufacturer, String carModel) {
        super(nrOfSeats, freightWeight, color, VIN);
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
    }
}
