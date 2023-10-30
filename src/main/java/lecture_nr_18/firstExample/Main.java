package lecture_nr_18.firstExample;

import lecture_nr_18.Constants;

public class Main {

    public static void main(String[] args) {
        Runnable r1 = () -> {
            System.out.println(Constants.ANSI_BLUE + "Hello from thread 1!"); // readFromKeyboard()
        };
        Runnable r2 = () -> {
            System.out.println(Constants.ANSI_RED + "Hello from thread 2!"); // readFromFile()
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        System.out.println(Constants.ANSI_RESET + "Hello from the main thread!");
        t2.start();

        //In order to start the execution of a thread you must always use the .start() method instead of .run()!

        // You cannot start a thread object more than once
        // If you need a thread to work twice, you need to re-create it's instance

//        t1.start(); // Won't Compile!
//        t2.start(); // Won't Compile!

    }
}
