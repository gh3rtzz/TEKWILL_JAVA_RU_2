package lecture_nr_10.example_2;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestIntegerList{

    boolean test(Integer i);
}

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for(int i = 0; i != 100; i++)
            intList.add(i);

        TestIntegerList testForEvenValues = (Integer i) -> {
            if(i % 2 == 0)
                return true;
            else
                return false;
        };

        testIntList(intList, testForEvenValues);
    }

    public static void testIntList(List<Integer> inputList, TestIntegerList testMethod){
        for (Integer element :
                inputList) {
            if (testMethod.test(element) == true)
                System.out.println(element);
        }
    }
}
