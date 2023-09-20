package lecture_nr_7.example_1;

public class Developer extends Employee{

    String programmingLanguage;
    int yearsOfExperience;

    public Developer(String name, String surname, int age, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, age);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void work() {
        System.out.println("Developer is programming in " + programmingLanguage);
    }
}
