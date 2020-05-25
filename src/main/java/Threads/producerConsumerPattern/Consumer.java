package Threads.producerConsumerPattern;

import java.util.concurrent.BlockingQueue;

public class Consumer<T> implements Runnable {

    private final BlockingQueue<T> blockingQueue;

    public Consumer(BlockingQueue<T> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }


    @Override
    public void run() {
        while (true){
            System.out.println("Wait to receive value from queue");
            try {
                System.out.println("Consumer got " + blockingQueue.take().toString() );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
