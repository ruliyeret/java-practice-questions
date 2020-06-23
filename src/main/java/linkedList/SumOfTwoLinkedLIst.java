package linkedList;

public class SumOfTwoLinkedLIst {

    public static int  carry = 0;

    private static int sumOfLinkedList(Node node){
        if(node == null){
            return 0;
        }
        return (int) (sumOfLinkedList(node.next) + (node.data * Math.pow(10, carry++)));
    }

    public static LinkedList sumOfTwoLinkedList(Node node1, Node node2){
       int sumLinkedList = sumOfLinkedList(node1);
       int SumOfTwocarry = 0;
       sumLinkedList += sumOfLinkedList(node2);
       LinkedList linkedList = new LinkedList();

       while (sumLinkedList > 0) {
            Node node = new Node(sumLinkedList % 10);
            node.next = linkedList.head;
           linkedList.head = node;
            sumLinkedList = sumLinkedList / 10;
       }
       return  linkedList;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2= new LinkedList();

        linkedList.head = new Node(1);
        linkedList.head.next = new Node(3);
        linkedList.head.next.next = new Node(0);

        linkedList2.head = new Node(2);
        linkedList2.head.next = new Node(5);
        linkedList2.head.next.next = new Node(1);

        linkedList.printList(sumOfTwoLinkedList(linkedList.head, linkedList2.head));
    }

}
