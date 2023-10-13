package lecture_nr_12.example_3;

import java.util.function.BiFunction;

public enum MathOperation {

    ADDITION((x, y) -> (float) x + y),
    SUBTRACTION((x, y) -> (float) x - y),
    MULTIPLICATION((x, y) -> (float) x * y),
    DIVISION((x, y) -> (float) x / y);

    private BiFunction<Integer, Integer, Float> mathOperation;

    MathOperation(BiFunction<Integer, Integer, Float> mathOperation) {
        this.mathOperation = mathOperation;
    }

    public BiFunction<Integer, Integer, Float> getMathOperation() {
        return mathOperation;
    }
}
