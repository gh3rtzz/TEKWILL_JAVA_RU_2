package lecture_nr_13;

public class Person {

    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) throws InvalidPersonException {
        for(int index = 0; index != name.length(); index++){
            if(Character.isDigit(name.charAt(index)) == true)
                throw new InvalidNameException("Name contains digits");
        }
        this.name = name;
        for(int index = 0; index != surname.length(); index++){
            if(Character.isDigit(surname.charAt(index)) == true)
                throw new InvalidSurnameException("Surname contains digits");
        }
        this.surname = surname;
        if(age > 100 || age < 0)
            throw new InvalidAgeException("Age is invalid");
        this.age = age;
    }
}

class PersonMain{
    public static void main(String[] args) {
        try {
            Person p1 = new Person("na3me", "surname", 30);
        } catch (InvalidPersonException e) {
//            System.out.println("Failed to create a new person, please try again!");
            e.printStackTrace();
        }


    }
}