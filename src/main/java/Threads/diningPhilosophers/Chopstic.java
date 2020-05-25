package Threads.diningPhilosophers;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstic {

    Lock lock;

    Chopstic(){
        this.lock = new ReentrantLock();
    }


    public void put(){
        this.lock.unlock();
    }

    public void pickUp(){
        this.lock.lock();
    }
}
