package lecture_nr_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AnotherMain {

    public static void main(String[] args) {
        SecondPerson p1 = new SecondPerson("Alex", "Ciobanu", 70, 170, 20);
        SecondPerson p2 = new SecondPerson("Andrey", "Soloviov", 60, 190, 30);
        SecondPerson p3 = new SecondPerson("Dumitru", "Turcanu", 90, 189, 45);
        SecondPerson p4 = new SecondPerson("Denis", "Loginov", 110, 160, 60);

        List<SecondPerson> secondPersonList = new ArrayList<>(
                Arrays.asList(
                        p2, p1, p4, p3
                )
        );

        secondPersonList.forEach(e -> System.out.println(e));

        System.out.println("--------------------- after sorting");
        secondPersonList.stream()
                .sorted()
                .forEach(e -> System.out.println(e));

        Comparator<SecondPerson> comparingByWeight = Comparator.comparing((SecondPerson e) -> e.weight);

        System.out.println("------------------- after comparing by weight");
        secondPersonList.stream()
                .sorted(comparingByWeight)
                .forEach(e -> System.out.println(e));


        System.out.println("Sorting by id");
        secondPersonList.stream()
                .sorted()
                .forEach(e -> System.out.println(e));
        System.out.println("Sorting by name");
        secondPersonList.stream()
                .sorted(SecondPersonComparators.SORT_BY_NAME.getComparator())
                .forEach(e -> System.out.println(e));
        System.out.println("Sorting by surname");
        secondPersonList.stream()
                .sorted(SecondPersonComparators.SORT_BY_SURNAME.getComparator())
                .forEach(e -> System.out.println(e));
        System.out.println("Soring by weight");
        secondPersonList.stream()
                .sorted(SecondPersonComparators.SORT_BY_WEIGHT.getComparator())
                .forEach(e -> System.out.println(e));
        System.out.println("Sorting by height");
        secondPersonList.stream()
                .sorted(SecondPersonComparators.SORT_BY_HEIGHT.getComparator())
                .forEach(e -> System.out.println(e));
        System.out.println("Sorting by age");
        secondPersonList.stream()
                .sorted(SecondPersonComparators.SORT_BY_AGE.getComparator())
                .forEach(e -> System.out.println(e));
    }

}

class SecondPerson implements Comparable<SecondPerson>{

    static int globalId = 0;
    int id;
    String name;
    String surname;
    int weight;
    int height;
    int age;

    public SecondPerson(String name, String surname, int weight, int height, int age) {
        globalId++;
        this.id = globalId;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(SecondPerson o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "SecondPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
