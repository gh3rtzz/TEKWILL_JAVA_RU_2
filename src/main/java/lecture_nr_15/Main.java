package lecture_nr_15;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Programmer> programmerList = new ArrayList<>();
        List<Janitor> janitorList = new ArrayList<>();
        List<Manager> managerList = new ArrayList<>();

        printAllEmployees(programmerList);
        printAllEmployees(janitorList);
        printAllEmployees(managerList);

        printAllEmployeesThatCanConductInterview(programmerList);
        printAllEmployeesThatCanConductInterview(managerList);
//        printAllEmployeesThatCanConductInterview(janitorList); //Won't compile!
    }

    public static void printAllEmployees(List<? extends Employee> inputList){

    }

    public static <T extends Employee & CanConductInterview> void printAllEmployeesThatCanConductInterview(List<T> inputList){

    }
}

class Person{
    public String name;
}

class Employee extends Person{

}

class Programmer extends Employee implements CanConductInterview, CanConductWorkshop{

}

class Manager extends Employee implements CanConductInterview{

}

class Janitor extends Employee{

}

interface CanConductInterview{

}

interface CanConductWorkshop{

}
