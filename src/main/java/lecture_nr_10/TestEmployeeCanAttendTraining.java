package lecture_nr_10;

public class TestEmployeeCanAttendTraining implements TestEmployee{

    @Override
    public boolean test(Employee e) {
        return e.canAttendTraining;
    }
}
