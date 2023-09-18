package lecture_nr_6.inheritance;

public class Vehicle {

    private int nrOfSeats;
    int freightWeight;
    String color;
    String VIN;

    public Vehicle(int nrOfSeats, int freightWeight, String color, String VIN) {
        this.nrOfSeats = nrOfSeats;
        this.freightWeight = freightWeight;
        this.color = color;
        this.VIN = VIN;
    }
}
