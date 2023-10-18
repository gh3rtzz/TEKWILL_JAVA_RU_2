package lecture_nr_14.WildCards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("asd", "asd");

        List<Person> personList = new ArrayList<>();

        personList.add(p1);

        printListWildCard(personList);
    }

    public static <T> void printList(List<T> inputList){
        for (T element :
                inputList) {
            System.out.println(element);
        }

        inputList.add(inputList.get(0));
    }

    public static void printListWildCard(List<?> inputList){
        for (Object element :
                inputList) {
            if(element instanceof Person){
                System.out.println("It's a person!");
            }
            System.out.println(element.toString());
        }
    }
}

class Person{

    String name;
    String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
