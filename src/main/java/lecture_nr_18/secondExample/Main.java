package lecture_nr_18.secondExample;

import lecture_nr_18.Constants;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // If you use a variable outside of the lambda expression
        // That variable automatically becomes final for the lambda block

        Runnable r1 = () -> {
            System.out.println(Constants.ANSI_RED + "First thread!");
            try {
                Thread.sleep(3000);
                System.out.println(Constants.ANSI_RED + "First thread stopped sleeping...");
            } catch (InterruptedException e) {
                System.out.println(Constants.ANSI_RED + "First thread's sleep has been interrupted");
            }
        };

        Runnable r2 = () -> {
            System.out.println(Constants.ANSI_BLUE + "Second thread!");
            try {
                Thread.sleep(3000);
                System.out.println(Constants.ANSI_BLUE + "Second thread stopped sleeping...");
            } catch (InterruptedException e) {
                System.out.println(Constants.ANSI_BLUE + "Second thread's sleep has been interrupted");
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        //Interrupts
//        t1.start();
//        t1.interrupt();
//        t2.start();
//        t2.interrupt();

        //Joining threads

        t1 = new Thread(r1);
        t2 = new Thread(r2);

        System.out.println("-------------------");

        t1.start();
        t1.join();
        t2.start();

    }
}
