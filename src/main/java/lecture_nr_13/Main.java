package lecture_nr_13;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 0;

//        System.out.println(x / y);
        System.out.println(divideEAFP(x, y));
        System.out.println("Divison is completed!");
    }

    public static int divideLBYL(int x, int y) {
        if (y == 0)
            return 0;
        else
            return x / y;
    }

    public static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        } catch (InputMismatchException e){
           return 0;
        }
    }
}
