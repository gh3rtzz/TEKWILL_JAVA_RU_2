package lecture_nr_12.example_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GasStation s1 = new GasStation(1,
                "str. Puskin 1", new FuelType[]{
                FuelType.DIESEL,
                FuelType.GASOLINE
        }, 4);
        GasStation s2 = new GasStation(2,
                "str. Dacia 140", new FuelType[]{
                FuelType.DIESEL,
                FuelType.GASOLINE,
                FuelType.ELECTRIC,
                FuelType.CNG,
                FuelType.LPG
        }, 6);
        GasStation s3 = new GasStation(3,
                "str. Puskin 1", new FuelType[]{
                FuelType.DIESEL,
                FuelType.GASOLINE,
                FuelType.ELECTRIC
        }, 3);

        List<GasStation> gasStationList = new ArrayList<>(
                Arrays.asList(
                        s1, s2, s3
                )
        );

        gasStationList.forEach((e) -> {
            for (FuelType element :
                    e.getFuelType()) {
                if (element.equals(FuelType.ELECTRIC))
                    System.out.println("Petrol station nr. " + e.getGasStationNumber() + " has electric!");
            }
        });
    }
}
