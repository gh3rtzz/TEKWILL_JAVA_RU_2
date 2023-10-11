package lecture_nr_11;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {
        Person p1 = new Person("Alexey", "Soloviov");
        Person p2 = new Person("Dumitru", "Ciobanu");
        Person p3 = new Person("Serghei", "Ciobanu");

        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        p1, p2, p3
                )
        );

        List<String> namesList = new ArrayList<>();

        for (Person element :
                personList) {
            namesList.add(element.name);
        }

        System.out.println(namesList);

        List<String> namesList2 = personList.stream()
                .map((e) -> e.name)
                .collect(Collectors.toList());

        //I need a list which will contain surnames that only start with letter C

        List<String> surnamesList = personList.stream()
                .map(e -> e.surname)
                .distinct()
                .filter(e -> e.startsWith("C"))
                .collect(Collectors.toList());

        System.out.println(surnamesList);

        //flatmap

        List<List<Person>> personpersonList = new ArrayList<>(
                Arrays.asList(
                        personList,
                        personList,
                        personList
                )
        );

        List<String> namesList3 = personpersonList.stream()
                .flatMap(e -> e.stream())
                .map(e -> e.name)
                .filter(e -> e.startsWith("X"))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(namesList3);

        //find the first occurance of a person with name being equal to Alexey

        //Person p1 = personList.stream()....

        //p1.name

        Optional<Person> optionalAlexey = personList.stream()
                .filter(e -> e.name.equals("Blexey"))
                .findFirst();

        if (optionalAlexey.isPresent()) {
            System.out.println(optionalAlexey.get().name);
        }

        Person alexey = personList.stream()
                .filter(e -> e.name.equals("Blexey"))
                .findFirst()
                .orElse(new Person("Dummy", "Person"));

        System.out.println(alexey.name);


        List<Integer> integerList = new ArrayList<>();

        for(int index = 0; index <= 10; index++)
            integerList.add(index);

        List<Integer> evenNumbers = integerList.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

        //One of terminal operations in streams is - foreach

        integerList.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));

        //allmatch will return true if every element in stream obeys the logic

        boolean allMatchTrue = personList.stream()
                .allMatch(e -> e.surname.startsWith("C"));

        System.out.println(allMatchTrue);

        long oddNumberCount = integerList.stream()
                .filter(e -> e % 2 != 0)
                .count();

        System.out.println(oddNumberCount);

        List<Integer> integerList1 = new ArrayList<>();

        for(int index = 10000000; index != 0; index--){
            integerList1.add(index);
        }

        System.out.println(LocalDateTime.now());
        integerList1.stream()
                .filter(e -> e % 2 == 0)
                .limit(20)
                .sorted()
                .forEach(e -> System.out.println(e));
        System.out.println(LocalDateTime.now());

        //preferred way

        long personCount = personList.stream()
                .filter(e -> e.surname.equals("Ciobanu"))
                .count();

        //alternative way

        long personCount1 = personList.stream()
                .map(e -> e.surname)
                .filter(e -> e.equals("Ciobanu"))
                .count();
    }
}

class Person {
    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
