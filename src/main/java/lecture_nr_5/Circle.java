package lecture_nr_5;

public class Circle {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);

        System.out.println(c1.calculateArea());
    }
}
