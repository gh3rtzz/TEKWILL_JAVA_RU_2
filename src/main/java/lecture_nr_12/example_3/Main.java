package lecture_nr_12.example_3;

public class Main {

    public static void main(String... args) {

        int x = 3;
        int y = 5;

        calculateAndPrintTheResult(x, y, MathOperation.DIVISION);

        MathOperation[] allMathOperations = MathOperation.values();

        for (MathOperation element :
                allMathOperations) {
            System.out.println(element);
        }

        System.out.println("-------------------------------");
        MathOperation operation = MathOperation.valueOf("DIVISION");
        System.out.println(operation);
    }

    public static void calculateAndPrintTheResult(int x, int y, MathOperation mathOperation){
        System.out.println("The result of " + mathOperation + " is: " + mathOperation.getMathOperation().apply(x, y));
    }
}
