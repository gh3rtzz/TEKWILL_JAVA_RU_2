package lecture_nr_12.example_1;

public enum FuelType {

    GASOLINE(26.6f),
    DIESEL(28.9f),
    CNG(19.3f),
    LPG(21.5f),
    ELECTRIC(5);


    private float fuelPrice;


    FuelType(float v) {
        this.fuelPrice = v;
    }

    public float getFuelPrice() {
        return fuelPrice;
    }
}
