package lecture_nr_20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            System.out.println("Hello! This is me running from the thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t2 = new Thread(r1);
        t2.start();
        t2.interrupt();

        // I need to run this runnable object 10 times

        ExecutorService threadPool1 = Executors.newFixedThreadPool(2);

        for(int index = 0; index != 10; index++){
            threadPool1.submit(r1);
        }

        threadPool1.shutdown();


        System.out.println("Using a simple for loop and overriding thread object to start 10 threads");

        for(int index = 0; index != 10; index++){
            System.out.println("New iteration " + index);
            Thread temporaryThread = new Thread(r1);
            temporaryThread.start();
        }

    }
}
