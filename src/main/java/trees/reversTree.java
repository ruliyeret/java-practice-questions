package trees;

public class reversTree {

    public static void reversTree(Node head){

       if(head.left != null && head.right != null) {

           int temp = head.left.value;
           head.left.value = head.right.value;
           head.right.value = temp;

           reversTree(head.left);
           reversTree(head.right);
       }
    }

    private static void print(Node head){

        if(head != null){
            System.out.print(head.value + " ");
            print(head.right);
            print(head.left);
        }

    }


    public static void main(String[] args) {
        Node node = new Node(2);
        node.right = new Node(4);
        node.left = new Node(5);

        System.out.print("Before reversing: ");
        print(node);
        reversTree(node);
        System.out.print("after reversed: ");
        print(node);
    }


}
