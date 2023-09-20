package lecture_nr_6.inheritance;

public class Plane extends Vehicle{

    private String planeManufacturer;
    private String planeModel;
    private int nrOfEngines;

    public Plane(int nrOfSeats, int freightWeight, String color, String VIN, String planeManufacturer, String planeModel, int nrOfEngines) {
        super(nrOfSeats, freightWeight, color, VIN);
        this.planeManufacturer = planeManufacturer;
        this.planeModel = planeModel;
        this.nrOfEngines = nrOfEngines;
    }

//    @Override
//    public void travel() {
//        System.out.println("Plane is flying..");
//    }

    public String getPlaneManufacturer() {
        return planeManufacturer;
    }

    public void setPlaneManufacturer(String planeManufacturer) {
        this.planeManufacturer = planeManufacturer;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public void setNrOfEngines(int nrOfEngines) {
        this.nrOfEngines = nrOfEngines;
    }
}
