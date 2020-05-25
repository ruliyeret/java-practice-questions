package stacks;

public class StackMin extends Stack {
    int min;

    public StackMin(int n) {
        super(n);
    }

    @Override
    public void push(int num) {
        if(isEmpty()){
            min = num;
            super.push(num);

        }else if(num < min){
                super.push((num * 2) - min);
                min = num;
        }
        else
            super.push(num);
    }

    @Override
    public int pop(){

        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        int num = super.pop();
        if(num  < min) {
            int t = min;
            min = (2* min) - num;
            return  t;


        }
        return num;
    }

    public int min(){
        return min;
    }



    public static void main(String[] args){

        StackMin s= new StackMin(5);
        s.push(9);
        s.push(10);
        s.push(3);
        s.push( 2);
        s.push(1);

        s.print();
        System.out.println("Minimum Element in the stack is: " + s.min());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.min());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.min());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.min());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.min());
        s.print();
    }
}
