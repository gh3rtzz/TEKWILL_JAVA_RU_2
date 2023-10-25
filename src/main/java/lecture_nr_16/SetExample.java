package lecture_nr_16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", "747");
        Airplane a2 = new Airplane("Airbus", "A320");

        Set<Airplane> airplaneSet = new TreeSet<>();

        airplaneSet.add(a1);
        airplaneSet.add(a2); //Throws error!
    }
}

class Airplane{

    String manufacturer;
    String model;

    public Airplane(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
