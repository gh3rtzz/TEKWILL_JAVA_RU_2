package lecture_nr_10;

public class TestEmployeeNameBeingsWithA implements TestEmployee{

    @Override
    public boolean test(Employee e) {
        return e.name.startsWith("A");
    }
}
