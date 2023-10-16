package lecture_nr_13;

public class StackTraceMain {

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(3 / 0);
        } catch (Exception ignored) {

        }

        System.out.println("This is the text after the stack trace!");
    }
}
