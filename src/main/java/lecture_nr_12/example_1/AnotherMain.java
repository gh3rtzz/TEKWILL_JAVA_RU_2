package lecture_nr_12.example_1;

public class AnotherMain {

    public static void main(String[] args) {
        PetrolCompany bemol = new PetrolCompany("Bemol SRL", "123190978123");

        bemol.addGasStationToList(
                new GasStation(1, "str. Puskin 1",
                        new FuelType[]{FuelType.DIESEL, FuelType.GASOLINE}, 3),
                new GasStation(2, "str. Dacia 140",
                        new FuelType[]{FuelType.DIESEL, FuelType.GASOLINE, FuelType.ELECTRIC}, 3)
        );

        for (GasStation element :
                bemol.getGasStationList()) {
            System.out.println("Gas station with nr. " + element.getGasStationNumber() + " has the following fuel types and prices:");
            for (FuelType element1 :
                    element.getFuelType()) {
                System.out.println(element1 + " price: " + element1.getFuelPrice());
            }
        }
    }
}
