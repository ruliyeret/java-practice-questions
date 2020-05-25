package queues;


import java.util.Dictionary;
import java.util.LinkedList;

public class AnimalShelter {

    abstract class Animal{
        private String name;
        protected int order;

        public void setOrder(int order){
            this.order = order;
        }

        public Animal(String name, int order){
            this.name = name;
            this.order = order;
        }

        public boolean isOrder(Animal a){
            return a.order > this.order;
        }

    }

    class Dog extends  Animal{

        public Dog(String name, int order) {
            super(name, order);
        }
    }

    class Cat extends  Animal{

        public Cat(String name, int order) {
            super(name, order);
        }
    }

    class AnimalQueue {

        LinkedList<Dog> dogs = new LinkedList();
        LinkedList<Dog> cats = new LinkedList();

         public void enqueue(Animal a){

             if (a instanceof Dog){
                 dogs.addLast((Dog)(a));
             }else if(a instanceof Cat){
                 cats.addLast((Dog)(a));
             }
             a.setOrder(a.order++);
         }

         public Animal dequeue(){

             if(dogs.size() == 0){
                 return cats.getFirst();
             }
             if(cats.size() == 0){
                 return dogs.getFirst();
             }

            return dogs.peek().isOrder(cats.peek()) ?
                    dogs.getFirst():cats.getFirst();



         }

    }


}

