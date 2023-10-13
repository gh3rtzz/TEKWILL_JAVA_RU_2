package lecture_nr_12.example_1;

import java.util.Arrays;

public class GasStation {

    private int gasStationNumber;
    private final String address;
    private final FuelType[] fuelType;
    private final int nrOfFillingStations;

    public GasStation(int gasStationNumber, String address, FuelType[] fuelType, int nrOfFillingStations) {
        this.gasStationNumber = gasStationNumber;
        this.address = address;
        this.fuelType = fuelType;
        this.nrOfFillingStations = nrOfFillingStations;
    }

    public int getGasStationNumber() {
        return gasStationNumber;
    }

    public String getAddress() {
        return address;
    }

    public FuelType[] getFuelType() {
        return fuelType;
    }

    public int getNrOfFillingStations() {
        return nrOfFillingStations;
    }

    public void setGasStationNumber(int gasStationNumber) {
        this.gasStationNumber = gasStationNumber;
    }

    @Override
    public String toString() {
        return "GasStation{" +
                "gasStationNumber=" + gasStationNumber +
                ", address='" + address + '\'' +
                ", fuelType=" + Arrays.toString(fuelType) +
                ", nrOfFillingStations=" + nrOfFillingStations +
                '}';
    }
}
