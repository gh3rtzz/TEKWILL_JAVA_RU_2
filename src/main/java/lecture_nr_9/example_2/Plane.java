package lecture_nr_9.example_2;

import com.sun.security.jgss.GSSUtil;

public class Plane extends Vehicle implements Moveable, Flyable{
    
    String planeModel;
    String planeManufacturer;

    public Plane(String serialNumber, Integer engineCount, String planeModel, String planeManufacturer) {
        super(serialNumber, engineCount);
        this.planeModel = planeModel;
        this.planeManufacturer = planeManufacturer;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying...");
    }

    @Override
    public void takeOff() {
        System.out.println(planeModel + " is taking off on the runway...");
    }

    @Override
    public void landing() {
        System.out.println(planeModel + " is landing on the runway...");
    }

    @Override
    public void move() {
        System.out.println(planeModel + " is moving to the runway...");
    }

    @Override
    public void stop() {
        System.out.println(planeModel + " is engaging reverse thrusters...");
    }
}
