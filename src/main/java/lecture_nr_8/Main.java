package lecture_nr_8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Need to create a List that is going to contain numbers from 0 to 10

        ArrayList<Integer> intList = new ArrayList<>();

        for(int index = 0; index <= 10; index++){
            intList.add(index);
        }

        // array[index] == intList.get(index)

        System.out.println(intList.get(5));

        // array.length == intList.size()

        System.out.println("The list size is: " + intList.size());

        System.out.println("Clearing the list");
        intList.clear();

        System.out.println("Printing out the list after clearing");

        System.out.println(intList);

        for(int index = 0; index <= 10; index++){
            intList.add(index);
        }

        intList.remove(5);

        System.out.println(intList);

        System.out.println(intList.get(5));

        intList.add(5, 5);

        System.out.println(intList);

        System.out.println("Does the list contain number 3: " + intList.contains(3));
        System.out.println("Does the list contain number 15: " + intList.contains(15));

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Alex");
        stringList.add("Dumitru");
        stringList.add("Evghenii");

        System.out.println(stringList.indexOf("Dumitru"));

        stringList.set(1, "Artiom");

        System.out.println(stringList);

        stringList.set(stringList.indexOf("Evghenii"), "Artur");

        System.out.println(stringList);

        //Maps

        HashMap<String, String> credentialsMap = new HashMap<>();

        credentialsMap.put("login", "johnDoe@gmail.com");
        credentialsMap.put("password", "passW0rd!");
        credentialsMap.put("firstName", "John");
        credentialsMap.put("lastName", "Doe");
        credentialsMap.put("", "emptyString");
        credentialsMap.put("-!%$@^%", "specialCharacters");
        credentialsMap.put(null, "nullValue");

        System.out.println("----------------------- MAPS ----------------------");
        System.out.println(credentialsMap);

        System.out.println(credentialsMap.get("login"));

        System.out.println(credentialsMap.get("firstName"));

        System.out.println(credentialsMap.get(""));
        System.out.println(credentialsMap.get(null));

        credentialsMap.put("lastName", "A");
        credentialsMap.put("lastName", "B");
        credentialsMap.put("lastName", "C");
        credentialsMap.put("lastName", "D");

        System.out.println(credentialsMap.get("lastName"));

        System.out.println("Does the map contain key lastName?: " + credentialsMap.containsKey("lastName"));
        System.out.println("Does the map contain value D: " + credentialsMap.containsValue("D"));

        credentialsMap.replace("123", "asd");

        System.out.println(credentialsMap.get("123"));


        System.out.println("----------------------- SETS ------------------------");

        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("Alexandru");
        stringSet.add("Dumitru");
        stringSet.add("Evghenii");

        System.out.println(stringSet);

        System.out.println("Does the set contain Dumitru?: " + stringSet.contains("Dumitru"));

        stringSet.remove("Dumitru");

        System.out.println(stringSet);

        stringSet.add("Alexandru");

        System.out.println(stringSet);

        for(int index = 0; index != intList.size(); index++){
            System.out.println(intList.get(index));
        }

        for(Integer element : intList){
            System.out.println(element);
        }

        for(String element : stringSet){
            System.out.println(element);
        }

        for(String element : credentialsMap.keySet()){
            System.out.println(element);
        }

        for(String element : credentialsMap.values()){
            System.out.println(element);
        }

        credentialsMap.containsKey("login");

        credentialsMap.keySet().contains("login");

        System.out.println("----------------------------- QUEUES -------------------------");

        ArrayDeque<String> stringDeque = new ArrayDeque<>();

        stringDeque.offer("Dumitru");
        stringDeque.offer("Alexey");
        stringDeque.offer("Platon");

        System.out.println(stringDeque);

        System.out.println(stringDeque.pop()); // FIFO

        System.out.println(stringDeque);

        stringDeque.offer("Dumitru");

        System.out.println(stringDeque);

        System.out.println(stringDeque.pollLast()); //LIFO

        System.out.println(stringDeque);

        System.out.println(stringDeque.peek());

        System.out.println(stringDeque);

        stringDeque.push("Dumitru");

        System.out.println(stringDeque);

        // FIFO - offer() -> IN poll() -> OUT

        // LIFO - push() -> IN pop() -> OUT






    }
}
