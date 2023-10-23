package lecture_nr_15.secondExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Fruit f = new Fruit();
        Citrus c = new Citrus();
        Orange o = new Orange();

        f = c;
        c = o;

        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit());
        List<Citrus> citrusList = new ArrayList<>();
        List<Orange> orangeList = new ArrayList<>();

        printAllFruitString(fruitList);
        printAllFruitString(citrusList);
        printAllFruitString(orangeList);

        List<String> stringList = new ArrayList<>(Arrays.asList("asd"));
//        printAllFruitString(stringList); --> Won't compile!

        addElementsToList(fruitList);
        addElementsToList(orangeList);
        addElementsToList(citrusList);

        fruitList.add(new Orange());
    }

    //Read only method | consumer method
    public static void printAllFruitString(List<? extends Fruit> inputList){
        Fruit f = inputList.get(0);

//        inputList.add(new Orange()); --> Won't compile!
    }

    //Write only method | producer method
    public static void addElementsToList(List<? super Orange> inputList){
//        Fruit f = inputList.get(0); //Won't compile!
//        Citrus c = inputList.get(0); //Won't compile!
//        Orange o = inputList.get(0); //Won't compile!
        Object obj = inputList.get(0); //The only to get elements from the producer method

        inputList.add(new Orange());
    }

}

class Fruit{
    public String fruit;
}

class Citrus extends Fruit{
    public String citrus;
}

class Orange extends Citrus{
    public String orange;
}

