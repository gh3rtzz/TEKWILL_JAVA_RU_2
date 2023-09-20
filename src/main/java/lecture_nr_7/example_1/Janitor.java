package lecture_nr_7.example_1;

public class Janitor extends Employee {

    int assignedFloor;

    public Janitor(String name, String surname, int age, int assignedFloor) {
        super(name, surname, age);
        this.assignedFloor = assignedFloor;
    }

    @Override
    public void work() {
        System.out.println("Janitor is cleaning the " + assignedFloor + " floor");
    }
}
