package linkedList;

public class CircleLinkedList {

    public static boolean isLinkedListCircle(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null  && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }


        return  slow == fast;
    }

    public static void main(String[] args){

        Node node1 = new Node(6);
        Node node2 = new Node(7);
        Node node3 = new Node(8);
        Node node4 = new Node(9);
        LinkedList linkedList = new LinkedList();
        linkedList.head = node1;
        linkedList.head.next = node2;
        linkedList.head.next.next = node3;
        linkedList.head.next.next.next = node4;

        System.out.println("Is circle linked list = " + isLinkedListCircle(linkedList.head));
        linkedList.head.next.next.next.next = linkedList.head;
        System.out.println("Is circle linked list = " + isLinkedListCircle(linkedList.head));
    }
}
