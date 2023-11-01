package lecture_nr_19.example_2;

// I need to create an app that will work like a chatting app
// There will be a shared object with read and write methods
// And there will be two more objects which will act as a consumer and a producer

import lecture_nr_18.Constants;

import java.util.Random;

public class Messages {

    public static void main(String[] args) {
        Message sharedMessageObject = new Message();
        Thread consumerThread = new Thread(new Consumer(sharedMessageObject));
        Thread producerThread = new Thread(new Producer(sharedMessageObject));

        producerThread.start();
        consumerThread.start();
    }
}

class Message {
    private String message = "";
    private boolean isEmpty = true;

    public synchronized String read() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException ignored) {

            }
        }
        isEmpty = true;
        notifyAll();
        return this.message;
    }

    public synchronized void write(String message) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException ignored) {

            }
        }
        isEmpty = false;
        this.message = message;
        notifyAll();
    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()) {
            System.out.println(Constants.ANSI_RED + "Message Consumed: " + latestMessage);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ignored) {

            }
        }
    }
}

class Producer implements Runnable {

    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] messages = {
                "Hello, this is the first message!",
                "This is the second one",
                "Third one incoming",
                "Latest one is here too"
        };

        for (int index = 0; index != messages.length; index++) {
            System.out.println(Constants.ANSI_GREEN + "Produced: " + messages[index]);
            message.write(messages[index]);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ignored) {

            }
        }
        message.write("Finished");
    }
}
