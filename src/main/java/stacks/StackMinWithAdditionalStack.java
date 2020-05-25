package stacks;

public class StackMinWithAdditionalStack extends Stack{
    Stack s;

    public StackMinWithAdditionalStack(int n) {
        super(n);
        s = new Stack(n);
    }

    @Override
    public void push(int num){
            if(isEmpty() || num <  s.peek()) {
                s.push(num);
            }else{
                s.push(s.peek());
            }
            super.push(num);
    }

    public int pop(){
        this.s.pop();
        return super.pop();
    }

    public int getMin() {
        return s.peek();
    }


    public static void main(String[] args){

        StackMinWithAdditionalStack s= new StackMinWithAdditionalStack(5);
        s.push(9);
        s.push(10);
        s.push(3);
        s.push( 2);
        s.push(1);

        s.print();
        System.out.println("Minimum Element in the stack is: " + s.getMin());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.getMin());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.getMin());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.getMin());
        System.out.println("Pop: " + s.pop());
        s.print();
        System.out.println("Minimum Element in the stack is: " + s.getMin());
        s.print();
    }

}
