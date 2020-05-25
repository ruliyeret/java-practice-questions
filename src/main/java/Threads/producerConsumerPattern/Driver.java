package Threads.producerConsumerPattern;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Driver {
    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingQueue();

        Producer<Integer> producer = new Producer<>(blockingQueue);
        Consumer<Integer> consumer = new Consumer<>(blockingQueue);

        producer.run();
        consumer.run();
    }
}
