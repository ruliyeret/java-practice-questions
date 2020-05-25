package stacks;

public class SortedStack extends Stack{

    public SortedStack(int n) {
        super(n);
    }


    public Stack sort(Stack s){
        Stack temp = new Stack(s.size() +1);

        while (!s.isEmpty()){
            int top = s.pop();

            while (!temp.isEmpty() && temp.peek() < top) {
                s.push(temp.pop());
            }

            temp.push(top);
        }

        return temp;
    }



    public static void main(String[] args){

        SortedStack sortedStack = new SortedStack(5);
        sortedStack.push(8);
        sortedStack.push(4);
        sortedStack.push(5);
        sortedStack.push(2);
        sortedStack.push(0);

        sortedStack.sort(sortedStack).print();
    }
}
