package lecture_nr_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionsExample {

    static List<Integer> integerList = new ArrayList<>();
    static ArrayBlockingQueue<Integer> queue1 = new ArrayBlockingQueue<>(2000);


    public static void main(String[] args) throws InterruptedException {

        integerList = Collections.synchronizedList(integerList);

//        Runnable r1 = () -> {
//            for(int index = 0; index != 1000; index++){
//                integerList.add(index);
//            }
//        };

        Thread t1 = new Thread(new FillCollection());
        Thread t2 = new Thread(new FillCollection());

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("The size of the integer list is: " + integerList.size());
        System.out.println("The size of the array block queue is: " + queue1.size());

        System.out.println();

//        integerList.forEach(e -> System.out.print(e + " "));
    }
}

class FillCollection implements Runnable{

    @Override
    public void run() {
        for(int index = 0; index != 1000; index++){
            CollectionsExample.queue1.offer(index);
        }
    }
}
