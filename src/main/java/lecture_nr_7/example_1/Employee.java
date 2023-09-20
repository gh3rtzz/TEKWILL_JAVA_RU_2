package lecture_nr_7.example_1;

public abstract class Employee {

    String name;
    String surname;
    int age;

    public void sayMyName(){
        System.out.println("My name is: " + name + " " + surname);
    }

    public abstract void work();

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
