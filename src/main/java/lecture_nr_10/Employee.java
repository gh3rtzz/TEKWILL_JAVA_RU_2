package lecture_nr_10;

public class Employee {

    String name;
    String surname;
    boolean canConductInterview;
    boolean canAttendTraining;

    public Employee(String name, String surname, boolean canConductInterview, boolean canAttendTraining) {
        this.name = name;
        this.surname = surname;
        this.canConductInterview = canConductInterview;
        this.canAttendTraining = canAttendTraining;
    }
}
