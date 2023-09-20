package lecture_nr_7.example_1;

public class Manager extends Employee{

    String teamName;
    int teamSize;

    public Manager(String name, String surname, int age, String teamName, int teamSize) {
        super(name, surname, age);
        this.teamName = teamName;
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Manager is filling in the report for " + teamName);
    }

    public void something(){
        System.out.println("Manger is doing something");
    }
}
