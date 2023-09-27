package lecture_nr_9.example_2;

public interface Moveable {

    void move();

    default void stop(){
        System.out.println("Moveable object is being stopped");
    }
}
