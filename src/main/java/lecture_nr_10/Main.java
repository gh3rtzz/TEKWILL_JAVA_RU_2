package lecture_nr_10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Andrei", "Sokolov", true, false));
        employeeList.add(new Employee("Evhenii", "Artiomov", false, true));

        System.out.println("Can attend training");
        testEmployee(employeeList, new TestEmployeeCanAttendTraining());
        System.out.println("Can conduct interview");
        testEmployee(employeeList, new TestEmployeeCanConductInterview());
        System.out.println("Name starts with A");
        testEmployee(employeeList, new TestEmployeeNameBeingsWithA());

        System.out.println("Surname is Sokolov");
        TestEmployee testForSurnameEqualToSokolov = (Employee e) -> {
            return e.surname.equals("Sokolov");
        };

        testEmployee(employeeList, testForSurnameEqualToSokolov);
    }

    //Print all employees that can conduct interview
    public static void testEmployee(List<Employee> inputList, TestEmployee testMethod){
        for (Employee element :
                inputList) {
            if (testMethod.test(element) == true)
                System.out.println(element.name);
        }
    }
}
