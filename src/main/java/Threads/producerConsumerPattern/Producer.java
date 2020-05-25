package Threads.producerConsumerPattern;

import java.util.concurrent.BlockingQueue;

public class Producer<T> implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }


    @Override
    public void run() {
        for (int i = 0; i< 10; i++){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                blockingQueue.add(i);
            }
    }
}
