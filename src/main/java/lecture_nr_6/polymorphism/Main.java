package lecture_nr_6.polymorphism;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 = new Animal();
        Cat c1 = new Cat();

        d1.makeSound();
        a1.makeSound();
        c1.makeSound();

        d1.makeSoundFromParent();
    }
}
