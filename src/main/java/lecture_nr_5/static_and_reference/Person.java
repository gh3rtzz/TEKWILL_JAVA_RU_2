package lecture_nr_5.static_and_reference;

public class Person {

    static int nrOfPersons = 0;
    String name;
    String surname;
    int age;
    boolean isMale;

    public Person(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
        nrOfPersons++;
    }

    public void sayMyName(){
        System.out.println("My name is! = " + this.name);
    }

    public static void printNrOfPersons(){
        System.out.println("Current number of persons = " + nrOfPersons);
    }
}
