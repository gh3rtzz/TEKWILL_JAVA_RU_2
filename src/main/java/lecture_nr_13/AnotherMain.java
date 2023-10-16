package lecture_nr_13;

import java.util.Scanner;

public class AnotherMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String readFromKeyboard = scanner.next();

        //I need to read an integer from the keyboard and multiply it by itself
        System.out.println(multiplyByItselfLBYL(readFromKeyboard));
        System.out.println(multiplyByItselfEAFP(readFromKeyboard));

    }

    public static int multiplyByItselfLBYL(String inputString) {
        //ASCII

        if (inputString.charAt(0) == '-' || Character.isDigit(inputString.charAt(0))) {
            for (int index = 1; index != inputString.length(); index++) {
                if (Character.isDigit(inputString.charAt(index)) == false)
                    return 0;
            }
        } else
            return 0;

        int parsedNumber = Integer.parseInt(inputString);



        return parsedNumber * parsedNumber;
    }

    public static int multiplyByItselfEAFP(String inputString) {
        try {
            int parsedNumber = Integer.parseInt(inputString);

            return parsedNumber * parsedNumber;
        } catch (NumberFormatException e) {
            return 0;
        } finally {
            System.out.println("Done with division!");
        }
    }

}
