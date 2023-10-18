package lecture_nr_14.genericMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Object p1 = new Person("Alexey", "Soloviov");
        String s1 = "Hello!";
        Integer i1 = 1;
        Float f1 = 2.0f;
        Character c1 = 'c';

        List<Object> objectList = new ArrayList<>();
        List<Person> personList1 = new ArrayList<>();

        printTwoParameters(i1, objectList);

        //
        printAllElementsFromTheList(personList1);
        printAllElementsFromTheList(objectList);
    }

    //A method that will accept any 2 parameters and print them out

    public static void printTwoParameters(Object first, Object second){
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }

    //Create a method that will accept any type of list and print all elements out
    public static <T> void printAllElementsFromTheList(List<T> inputList){
        for (T element :
                inputList) {
            System.out.println(element);
        }
    }
}

class Person {

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
