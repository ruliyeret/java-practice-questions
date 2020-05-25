package queues;

import stacks.Stack;

public class QueueviaStacks {
    Stack s1;
    Stack s2;

    public QueueviaStacks(int n){
        s1 = new Stack(n);
        s2 = new Stack(n);
    }

    public void enQueue(int num){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(num);

        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int deQueue(){
        if(!s1.isEmpty()) {
            return s1.pop();
        }else{
            System.out.println("The Queue empty");
            return -1;
        }
    }


    public static void main(String[] args)
    {
        QueueviaStacks q = new QueueviaStacks(3);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
