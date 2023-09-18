package lecture_nr_6.polymorphism;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog is barking!");
    }

    public void makeSoundFromParent(){
        super.makeSound();
    }
}
