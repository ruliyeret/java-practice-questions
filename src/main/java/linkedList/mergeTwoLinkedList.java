package linkedList;

public class mergeTwoLinkedList {

    public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {

        LinkedList linkedList = new LinkedList();
        while (l1.head != null && l2.head != null){
            linkedList.head = l1.head;
            linkedList.head.next = l2.head;

            l1.head = l1.head.next;
            l2.head = l2.head.next;
            linkedList.head = linkedList.head.next;
        }

        return  linkedList;
    }



    public static void main(String[] args) {

        LinkedList linkedList2 = new LinkedList();

        LinkedList linkedList = new LinkedList();

        linkedList.head = new Node(10);
        linkedList.head.next = new Node(12);
        linkedList.head.next.next = new Node(11);
        linkedList.head.next.next.next.next.next.next = new Node(18);

        linkedList2.head = new Node(11);
        linkedList2.head.next = new Node(16);
        linkedList2.head.next.next = new Node(12);
        linkedList2.head.next.next.next.next.next.next = new Node(20);

        // spouse to be 10 -> 11 -> 12 -> 16 -> 11 -> 12 -> 18 -> 20
        linkedList.printList(mergeTwoLists(linkedList, linkedList2));

    }
}
