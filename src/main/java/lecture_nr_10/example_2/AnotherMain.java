package lecture_nr_10.example_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AnotherMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Andrei");
        list.add("Serghei");
        list.add("Artiom");
        list.add("Dumitru");

        Predicate<String> testNameStartsWithA = (String s) -> s.startsWith("A");
        Predicate<String> testNameLengthIs6 = (String s) -> {
            return s.length() == 6;
        };


        testListForSomething(list, testNameStartsWithA);
        System.out.println("----------------");
        testListForSomething(list, testNameLengthIs6);

        Consumer<String> printAllElementsAndAddLetterAAthTheEnd = (String s) -> System.out.println(s + " A");

        System.out.println("-----------------------------");

        applyConsumerForAllElements(list, printAllElementsAndAddLetterAAthTheEnd);

        Function<String, String> addAAtTheEndOfAllElements = (String s) -> s + " A";
        Function<String, String> addBAtTheEndOfAllElements = (String s) -> s + " B";
        Function<String, String> addCAtTheEndOfAllElements = (String s) -> {
            return s + " C";
        };

        System.out.println("-------------------------");
        applyFunctionForAllElementsAndPrintThemOut(list, addCAtTheEndOfAllElements);

        Supplier<List<String>> returnNewListWith5Names = () -> {
            List<String> namesList = new ArrayList<>();

            namesList.add("Andrei");
            namesList.add("Serghei");
            namesList.add("Dumitru");
            namesList.add("Artiom");
            namesList.add("Petru");

            return namesList;
        };

        Supplier<List<String>> returnEmptyList = () -> {
            return new ArrayList<>();
        };

        System.out.println("-------------------------");
        List<String> newList = supplyANewListWithSomeElements(returnNewListWith5Names);

        applyConsumerForAllElements(newList, printAllElementsAndAddLetterAAthTheEnd);

    }

    public static List<String> supplyANewListWithSomeElements(Supplier<List<String>> supply){
        return supply.get();
    }

    public static void applyFunctionForAllElementsAndPrintThemOut(List<String> inputList, Function<String, String> inputFunction){
        for (String element :
                inputList) {
            System.out.println(inputFunction.apply(element));
        }
    }

    public static void applyConsumerForAllElements(List<String> inputList, Consumer<String> consumer){
        for (String element :
                inputList) {
            consumer.accept(element);
        }
    }

    public static void testListForSomething(List<String> inputList, Predicate<String> testMethod){
        for (String element :
                inputList) {
            if (testMethod.test(element) == true)
                System.out.println(element);
        }
    }
}
