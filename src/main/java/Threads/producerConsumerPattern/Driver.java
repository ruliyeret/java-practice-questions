package Threads.producerConsumerPattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new LinkedBlockingQueue();

        Producer<Integer> producer = new Producer<>(blockingQueue);
        Consumer<Integer> consumer = new Consumer<>(blockingQueue);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();

        Thread.sleep(2000);

        producerThread.interrupt();
        consumerThread.interrupt();
    }
}
