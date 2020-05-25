package Threads.fizzBuzz;

import java.util.function.Predicate;

public class FizzBuzzOneThread {

    public static void fizzBuzz(int n){

        Predicate<Integer> divisible3 = (num) -> num % 3 ==0;
        Predicate<Integer> divisible5 = (num) -> num % 5 ==0;


        for (int i=0; i < n; i++){
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
    }

    public static void main(String[] args) {
        long start  = System.currentTimeMillis();
        fizzBuzz(1000);
        long end  = System.currentTimeMillis();
        System.out.println("Took : " + (end - start));
    }
}
