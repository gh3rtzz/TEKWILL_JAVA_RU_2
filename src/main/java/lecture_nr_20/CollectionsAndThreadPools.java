package lecture_nr_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CollectionsAndThreadPools {

    static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        integerList = Collections.synchronizedList(integerList);

        ExecutorService threadPool1 = Executors.newFixedThreadPool(3);

        FillCollection1 f1 = new FillCollection1();

        for(int index = 0; index != 10; index++){
            threadPool1.submit(f1);
        }

        threadPool1.awaitTermination(4, TimeUnit.MILLISECONDS);
        threadPool1.shutdown();

        System.out.println("The size of the integer list is " + integerList.size());

    }
}

class FillCollection1 implements Runnable{

    @Override
    public void run() {
        for(int index = 0; index != 1000; index++){
            CollectionsAndThreadPools.integerList.add(index);
        }
    }
}
