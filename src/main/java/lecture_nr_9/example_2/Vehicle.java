package lecture_nr_9.example_2;

public abstract class Vehicle {

    String serialNumber;
    
    Integer engineCount;

    public Vehicle(String serialNumber, Integer engineCount) {
        this.serialNumber = serialNumber;
        this.engineCount = engineCount;
    }

    public void fillFuel(){
        System.out.println("Vehicle is being filled up with fuel...");
    }
}
