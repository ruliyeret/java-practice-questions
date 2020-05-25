package linkedList;

public class LinkedList {

    public  Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void printList(LinkedList linkedList)
    {
        Node head = linkedList.head;
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
