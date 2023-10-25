package lecture_nr_16;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Alex1", "Ciobanu");
        Person p2 = new Person("Alex", "Ciobanu");

        System.out.println("P1 hashcode: " + p1.hashCode());
        System.out.println("P2 hashcode: " + p2.hashCode());
        System.out.println(p1.equals(p2));

        List<Integer> intList = new ArrayList<>();

        intList.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Person> personList = new ArrayList<>(Arrays.asList(
                p1, p2
        ));

        System.out.println("Compare to: " + p1.compareTo(p2));

        String s1 = "Hello1";
        String s2 = "Hello";

        System.out.println("Compare strings: " + s1.compareTo(s2));

        personList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Compare to another example: " + p1.compareTo(p2));
    }
}

class Person implements Comparable<Person>{

    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int compareTo(Person o) {
        //Comparator

        return Comparator.comparing((Person p1) -> p1.name)
                .thenComparing((Person p1) -> p1.surname)
                .compare(this, o);
    }
}
