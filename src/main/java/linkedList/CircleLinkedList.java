package linkedList;

public class CircleLinkedList {

    public static boolean isLinkedListCircle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head.next;

        while (fast != null && fast.next != null  && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }


        return  slow == fast;
    }

    public static void main(String[] args){

        LinkedList.Node node1 = new LinkedList.Node(6);
        LinkedList.Node node2 = new LinkedList.Node(7);
        LinkedList.Node node3 = new LinkedList.Node(8);
        LinkedList.Node node4 = new LinkedList.Node(9);
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
