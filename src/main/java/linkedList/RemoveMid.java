package linkedList;

public class RemoveMid {

    public static void removeMid(LinkedList.Node node){

        LinkedList.Node slow = node;
        LinkedList.Node fast = node;
        LinkedList.Node prev = null;

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

        linkedList.head = new LinkedList.Node(10);
        linkedList.head.next = new LinkedList.Node(11);
        linkedList.head.next.next = new LinkedList.Node(12);
        linkedList.head.next.next.next = new LinkedList.Node(13);
        linkedList.head.next.next.next.next = new LinkedList.Node(14);

        System.out.println("Before removed the mid element");
        LinkedList.printList(linkedList);
        removeMid(linkedList.head);
        System.out.println("After removed the mid element");
        LinkedList.printList(linkedList);
    }
}
