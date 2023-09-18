package lecture_nr_6.inheritance;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car(
                5,
                500,
                "Blue",
                "123123123123123123",
                "BMW",
                "428i"
        );

        System.out.println(c1.carModel);

        Plane p1 = new Plane(
                100,
                5000,
                "White",
                "P123123123123",
                "Boening",
                "737",
                2
        );

        System.out.println(p1.freightWeight);

        System.out.println(p1.getPlaneModel());

    }
}
