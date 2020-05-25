package Threads;

import java.util.Objects;

public class deadLockProgram {

      static Object object1 = new Object();
      static Object object2 = new Object();

      private static class Thread1 extends Thread {

          @Override
          public void run() {

              synchronized (object1){
                  System.out.println("Thread1 lock the object1");

                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  synchronized (object2){
                      System.out.println("Thread1 lock the object12");
                  }
              }
          }
      }


    private static class Thread2 extends Thread {

        @Override
        public void run() {

            synchronized (object2) {
                System.out.println("Thread2 lock the object2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object1) {
                    System.out.println("Thread2 lock the object1");
                }
            }
        }
    }

    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();

    }
}
