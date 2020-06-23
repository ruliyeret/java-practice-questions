package linkedList;

import static linkedList.LinkedList.printList;

public class RemoveMid {

    public static void removeMid(Node node){

        Node slow = node;
        Node fast = node;
        Node prev = null;

        if(node == null && node.next == null) {
            System.out.println("There is not middle element in the list");
        }else {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;

                prev = slow;
                slow = slow.next;
            }
            prev.next = slow.next;
        }

    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(10);
        linkedList.head.next = new Node(11);
        linkedList.head.next.next = new Node(12);
        linkedList.head.next.next.next = new Node(13);
        linkedList.head.next.next.next.next = new Node(14);

        System.out.println("Before removed the mid element");
        printList(linkedList);
        removeMid(linkedList.head);
        System.out.println("After removed the mid element");
        printList(linkedList);
    }
}
