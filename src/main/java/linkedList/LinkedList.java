package linkedList;

import javax.swing.*;

public class LinkedList {

    public  Node head;

    public LinkedList(){
        this.head = new Node();
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
