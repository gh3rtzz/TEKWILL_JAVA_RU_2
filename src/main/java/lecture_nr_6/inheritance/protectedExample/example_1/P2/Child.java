package lecture_nr_6.inheritance.protectedExample.example_1.P2;

import lecture_nr_6.inheritance.protectedExample.example_1.P1.Parent;

public class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Child c = new Child("Test");
        System.out.println(c.name);
    }
}
