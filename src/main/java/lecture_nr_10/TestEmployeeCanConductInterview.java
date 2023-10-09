package lecture_nr_10;

public class TestEmployeeCanConductInterview implements TestEmployee{

    @Override
    public boolean test(Employee e) {
        return e.canConductInterview;
    }
}
