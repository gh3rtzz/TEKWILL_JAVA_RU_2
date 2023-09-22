package lecture_nr_7.example_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Manager m1 = new Manager("Alexey", "Sokolov", 30, "spartans", 20);
        Developer d1 = new Developer("Serghei", "Artiomov", 25, "C#", 3);
        Janitor j1 = new Janitor("Dumitru", "Alexeev", 40, 5);

        j1.work();
        d1.work();
        m1.work();

        m1.sayMyName();
        d1.sayMyName();
        j1.sayMyName();

        Employee d = new Developer("Serghei", "Artiomov", 25, "C#", 3);

        Developer d2 = (Developer) d;

        Company c1 = new Company("Apple",
                new Employee[]{d1, m1, j1});

        System.out.println("-------------------");
        c1.printAllEmployeeNames();

        System.out.println("-------------instanceof");

        c1.callSomethingMethodFromManagers();

        System.out.println("------------------- instanceof developers");

        c1.makeAllDevelopersWork();
    }
}
