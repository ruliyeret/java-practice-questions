package linkedList;
import java.util.HashSet;

public class RemoveDups {

    public static void removeDuplicate(LinkedList linkedList){

            HashSet<Integer> set  = new HashSet();

            LinkedList.Node current  = linkedList.head;
            LinkedList.Node prev = null;

            while (current != null){

                if(set.contains(current.data)){
                        prev.next = current.next;
                }else{
                    set.add(current.data);
                    prev = current;
                }
                current = current.next;
            }
        }

    public static void main(String[] args)
    {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        LinkedList linkedList = new LinkedList();

         linkedList.head = new LinkedList.Node(10);
        linkedList.head.next = new LinkedList.Node(12);
        linkedList.head.next.next = new LinkedList.Node(11);
        linkedList.head.next.next.next = new LinkedList.Node(11);
        linkedList.head.next.next.next.next = new LinkedList.Node(12);
        linkedList.head.next.next.next.next.next = new LinkedList.Node(11);
        linkedList.head.next.next.next.next.next.next = new LinkedList.Node(10);

        System.out.println("Linked list before removing duplicates :");
        LinkedList.printList(linkedList);

        removeDuplicate(linkedList);

        System.out.println("\nLinked list after removing duplicates :");
        LinkedList.printList(linkedList);
    }
}


