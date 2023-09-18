package lecture_nr_5.static_and_reference;

public class Main {

    public static void main(String[] args) {
        Person dmitry = new Person("Dmitry", "Sokolov", 30, true);
        Person artiom = new Person("Artiom", "Soloviov", 20, true);
        System.out.println("Nr of persons is: " + Person.nrOfPersons);

        dmitry.sayMyName();
        Person.printNrOfPersons();
    }
}
