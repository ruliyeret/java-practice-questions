package stacks;

public class Stack {
    private  int[] arr;
    private int pos = -1;

    public Stack(int n){
        this.arr = new int[n];
    }

    public void push(int num){
        this.arr[++this.pos] = num;
    }

    public int pop(){
        if(!this.isEmpty()) {
            return this.arr[pos--];
        }else{
            return  -1;
        }
    }

    public int peek(){
        return this.arr[this.pos];
    }

    public boolean isEmpty(){
        return this.pos < 0;
    }

    public void print(){
        for (int i=pos; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] getArr() {
        return this.arr;
    }

    public int size(){
        return pos;
    }
}
