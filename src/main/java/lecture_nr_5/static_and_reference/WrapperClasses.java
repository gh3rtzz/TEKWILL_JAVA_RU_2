package lecture_nr_5.static_and_reference;

public class WrapperClasses {

    public static void main(String[] args) {

        String inputString = "1001a";

        int x = Integer.parseInt(inputString);
        Integer y = Integer.parseInt(inputString);

        Float f = y.floatValue();
    }
}
