package Threads.diningPhilosophers;

public class Philosopher implements Runnable {

    private Object left;
    private Object right;
    public Philosopher(Object left, Object right){
        this.left = left;
        this.right = right;
    }


    private void doAction(String action) throws InterruptedException {
        System.out.println(
                Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }


    public void run(){

        while (true){
            try {
                this.doAction("Thinking");
                synchronized (left){
                    doAction(System.nanoTime() + ": Picked up left fork");
                }
                synchronized (right){
                    doAction(System.nanoTime() + ": Picked up right fork");
                    doAction(System.nanoTime() + ": Put down right fork");
                }

                doAction(System.nanoTime() + ": Put down left fork. Back to thinking");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
