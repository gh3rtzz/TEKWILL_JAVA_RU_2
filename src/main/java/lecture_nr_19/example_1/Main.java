package lecture_nr_19.example_1;

import lecture_nr_18.Constants;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Countdown c = new Countdown(); // has one address
        Thread t1 = new CountdownThread(c);
        Thread t2 = new CountdownThread(c);

        t1.setName("T1");
        t2.setName("T2");

        t1.start(); // 836
//        t1.join();
        t2.start(); // 096
//        t2.join();

        //832
        System.out.println(Constants.ANSI_GREEN + " Printing main thread name: " + Thread.currentThread().getName() + LocalDateTime.now());


    }
}

class Countdown{

    int index = 0;

    public void startCountdown() throws Exception {
        String threadColor = "";
        switch (Thread.currentThread().getName()){
            case "T1":
                threadColor = Constants.ANSI_BLUE;
                break;
            case "T2":
                threadColor = Constants.ANSI_RED;
                break;
            default:
                throw new Exception("Thread name invalid");
        }
        synchronized (this) {
            for (index = 0; index <= 10; index++) {
                System.out.println(threadColor + "Printing index: " + index + " from: " + Thread.currentThread().getName() + " " + LocalDateTime.now());
            }
        }
    }
}

class CountdownThread extends Thread{

    Countdown c;

    public CountdownThread(Countdown c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            c.startCountdown();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
