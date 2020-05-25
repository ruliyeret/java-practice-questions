package Threads.fizzBuzz;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class FizzBuzzWithMultiThreads {


   static Predicate<Integer> divisible3 = (num) -> num % 3 ==0;
   static Predicate<Integer> divisible5 = (num) -> num % 5 ==0;

    private static void handleNumber(int i){
        if (divisible3.test(i) && divisible5.test(i)){
            System.out.println("FizzBuzz " + i);
        }
        else if(divisible3.test(i)){
            System.out.println("Fizz " + i);
        }
        else if(divisible5.test(i)){
            System.out.println("Buzz " + i);
        }
    }

    private static class DivisibleTask implements Runnable{

        private int start;
        private int end;
        public DivisibleTask(int start, int end){
            this.start = start;
            this.end = end;

        }

        @Override
        public void run() {
            for (int i= start; i< end; i++){
                handleNumber(i);
            }

        }
    }

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        long start  = System.currentTimeMillis();
        int n = 1000;
        int partialN = n / 4;
        Object object = new Object();
        pool.submit(new DivisibleTask(0, partialN));
        pool.submit(new DivisibleTask(partialN, partialN *2));
        pool.submit(new DivisibleTask(partialN *2 , partialN *3));
        pool.submit(new DivisibleTask(partialN *3, partialN *4));

        pool.shutdown();
        try {
            pool.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("Took : " + (end - start));


    }
}
